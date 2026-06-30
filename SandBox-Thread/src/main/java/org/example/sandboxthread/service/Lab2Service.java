package org.example.sandboxthread.service;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.example.sandboxthread.model.Account;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

@Service
public class Lab2Service {

    private final Account sharedAccount = new Account();

    public CompletableFuture<Integer> withdraw(int amount){

        System.out.println(">>> BẮT ĐẦU REQUEST: " + " trên Thread: " + Thread.currentThread().getName());
        return CompletableFuture.supplyAsync(() -> {

            System.out.println(">>> Chạy trong Async của Request: " + " trên Thread: " + Thread.currentThread().getName());
            //Test 2
//            int x = 10 / 0;

            // Test 3
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            int balanceAfterWithdraw = sharedAccount.withdraw(amount);

            System.out.println("Thread: " + Thread.currentThread().getName() + " -> Số dư lúc trừ: " + balanceAfterWithdraw);

            return balanceAfterWithdraw;

        });
    }
}
