package com.example.firstwebapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@Controller
@RestController
public class control {
    @RequestMapping("/test")
    public String hello() {
        return "index.html";
    }
}
