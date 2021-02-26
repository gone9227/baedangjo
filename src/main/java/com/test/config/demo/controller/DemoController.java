package com.test.config.demo.controller;

import com.test.config.demo.dto.DtoConfigPropertyTest;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class DemoController {

    private final DtoConfigPropertyTest dtoConfigPropertyTest;

    @GetMapping("/hello")
    public String hello(){

        System.out.println("TEST DTO name = " + dtoConfigPropertyTest.getName());
        System.out.println("TEST DTO value = " + dtoConfigPropertyTest.getValue());

        return "hello";
    }

}
