package com.ankesh.devopsdemo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController {

    @RequestMapping("/greet")
    public String greet() {

        return "Hello, Welcome to the DevopsDemo..........";

    }

}
