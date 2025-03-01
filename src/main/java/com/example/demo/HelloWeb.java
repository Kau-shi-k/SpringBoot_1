package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWeb {
    @GetMapping("/web")
    public String hello(){
        return "Hello Web";
    }

    @GetMapping("/web/message")
    public String message(){
        return "Leads To Message Path";
    }


}
