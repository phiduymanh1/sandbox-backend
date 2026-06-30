package org.example.sandboxthread.controller;

import lombok.RequiredArgsConstructor;
import org.example.sandboxthread.service.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
@RequiredArgsConstructor
public class TestController {

    private final TestService testService;

    @GetMapping
    public String test() {

        testService.testFunc();

        return "test";
    }
}
