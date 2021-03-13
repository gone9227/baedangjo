package com.test.config.demo.controller;

import com.test.config.demo.dto.LoginVO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Slf4j
@Controller
@RequiredArgsConstructor
public class DemoController {

    @GetMapping("/")
    public String home(){
        return "index";
    }

    @GetMapping("/sign-in")
    public String signIn(){
        return "common/signin";
    }

    @PostMapping("/sign-in")
    public String signIn(@ModelAttribute LoginVO loginVO){
        log.debug("Login VO = {}", loginVO);
        return "system/success";
    }

    @GetMapping("/sign-up")
    public String signUp(){
        return "common/signup";
    }

}
