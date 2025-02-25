package com.example.messaging_app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//UC-1
@RestController
public class MessagingController {
    @GetMapping("/hello")
    public String sayHello(){
        return "Hello from BridgeLabz";
    }

}



