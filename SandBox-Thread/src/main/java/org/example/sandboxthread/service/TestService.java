package org.example.sandboxthread.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    @Async
    public void testFunc(){

        try {
            Thread.sleep(10000);

            System.out.println("Done sleep thread: "+Thread.currentThread().getName());

        }catch (Exception e){
            throw new RuntimeException(e);
        }

    }
}
