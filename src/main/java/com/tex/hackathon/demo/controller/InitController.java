package com.tex.hackathon.demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InitController {

    @RequestMapping("/users/{userId}/accounts")
    String hello(@PathVariable String name) {
        return "Hello, " + name + "!";
    }
}
