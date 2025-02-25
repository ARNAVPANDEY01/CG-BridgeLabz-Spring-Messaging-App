package com.example.messaging_app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MessagingController {


    //UC1: Handle GET Request to return Hello message
    //@GetMapping("/hello")
    //public String sayHello(){

    //    return "Hello from BridgeLabz";
    //}



    //UC2: GET REQUEST with query paramenter
    @GetMapping
    public String name(@RequestParam String name){
        return "Hello" + name + "!";
    }

}



