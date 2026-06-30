package org.example.sandboxthread;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class SandBoxThreadApplication {

    public static void main(String[] args) {
        SpringApplication.run(SandBoxThreadApplication.class, args);
    }

}
