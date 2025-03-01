package com.example.demo.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class HelloWeb {
    @GetMapping("/web")
    public String hello(){
        return "Hello Web";
    }

    @GetMapping("web/message")
    public String message(){
        return "Leads To Message Path";
    }

    @RequestMapping(value = {"query"}, method = RequestMethod.GET)
    public String name(@RequestParam(value = "name") String name){
        return "Hello" + name + "!";
    }


}

