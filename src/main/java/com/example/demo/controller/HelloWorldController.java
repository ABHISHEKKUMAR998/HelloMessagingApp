package com.example.demo.controller;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {

    // GET Request :- Rest call: curl localhost:8080/hello -w "\n"
    @RequestMapping(value = {"", "/", "/home"})
    public String hello(){
        return "Hello from Bridgelabz";
    }
    @RequestMapping(value = {"/query"}, method = RequestMethod.GET)
    public String sayHello(@RequestParam (value ="name")String name)
    {
    	return "Hello" + " " +name + "From " + "BridgeLaz";
    	
    }
    @GetMapping("/param/{name}")
    public String helloParam(@PathVariable String name){
        return "Hello " + name +" !!";
    }
    
    @PostMapping("/post")
    public String hello(@RequestBody User user){
        return "Hello " + user.getFirstName() + " " + user.getLastName() + " !!";
    }
    
    @PutMapping("/put/{firstname}")
    public String sayHelloPut(@PathVariable String firstname, @RequestParam(value ="lastname" )String lastname)
    {
    	return "Hello" +" "+ firstname + " " + lastname +
    			" " + "From  Bridgelabz"; 
    }
}

