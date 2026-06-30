package org.example.sandboxthread.model;

import lombok.Getter;

import java.util.concurrent.atomic.AtomicInteger;

@Getter
public class Account {

    private final AtomicInteger balance = new AtomicInteger(100);
    //Test1
//    private int balance = 1000;

    public int withdraw(int amount){
        return balance.addAndGet(-amount);
    }   
    //Test1
//    public int withdraw(int amount){
//        balance -= amount;
//        return balance;
//    }
}
