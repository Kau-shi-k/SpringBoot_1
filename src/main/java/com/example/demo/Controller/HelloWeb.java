package com.example.demo.Controller;

import com.example.demo.Model.User;
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

    @GetMapping("/param/{name}")
    public String nameParam(@PathVariable String name){
        return "Hello" + name + "!";
    }

    @PostMapping("/Post")
    public String namePost(@RequestBody User user){
        return "Hello" + " "  + user.getFirstName() + " " + user.getLastName() + " " + "!";
    }

    @PutMapping("/put/{firstName}")
    public String sayHello(@PathVariable String firstName, @RequestParam(value = "lastName") String lastName) {

        return "Hello: " + firstName +  lastName + "!";

    }

}

