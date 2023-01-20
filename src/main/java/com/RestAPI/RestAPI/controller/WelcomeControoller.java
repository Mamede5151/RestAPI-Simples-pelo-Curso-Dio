package com.RestAPI.RestAPI.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class WelcomeControoller {
    @RequestMapping("/")
    public String welcome(){
        return  "Welcome to the Jungle!";
    }
}
