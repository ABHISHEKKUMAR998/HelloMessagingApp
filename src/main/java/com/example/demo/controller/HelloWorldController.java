package com.example.demo.controller;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {

    // GET Request :- Rest call: curl localhost:8080/hello -w "\n"
    @RequestMapping(value = {"", "/", "/home"})
    public String hello(){
        return "Hello from Bridgelabz";
    }
}
