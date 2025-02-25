package com.example.messaging_app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/Hello")
public class MessagingController {


    //UC1: Handle GET Request to return Hello message
    //@GetMapping("/hello")
    //public String sayHello(){

    //    return "Hello from BridgeLabz";
    //}


    //UC2: GET REQUEST with query paramenter
//    @GetMapping
//    public String name(@RequestParam String name){
//        return "Hello" + name + "!";
    //}

    //UC3: GET Request Method with Path Variable
    @GetMapping("/{name}")
    public String name(@PathVariable String name){
        return "Hello, " + name + " from BridgeLabz";
    }
}













