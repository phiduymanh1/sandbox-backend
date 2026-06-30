package org.example.sandboxthread.controller;

import lombok.RequiredArgsConstructor;
import org.example.sandboxthread.service.Lab2Service;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.CompletableFuture;

@RestController
@RequestMapping("/lab2")
@RequiredArgsConstructor
public class Lab2Controller {

        private final Lab2Service lab2Service;

        @PostMapping("/withdraw")
        public CompletableFuture<Integer> withdraw(@RequestParam Integer amount){
            System.out.println("Thread: " + Thread.currentThread().getName());
            return lab2Service.withdraw(amount);
        }
}
