package com.flz.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HelloController {

    // http://localhost:9091
    @GetMapping("/")
    public String hello(){
        return "AuthService Hello";
    }

    // http://localhost:9091/info
    @GetMapping("/info")
    public String info(){
        return "INFO: Contains the Information of AuthService ";

    }
}
