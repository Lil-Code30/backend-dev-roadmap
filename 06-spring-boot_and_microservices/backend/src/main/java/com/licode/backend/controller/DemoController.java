package com.licode.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/home")
    //@RequestMapping("home")
    //@RequestMapping(path = "/home", method = {RequestMethod.GET, RequestMethod.POST})
//    @RequestMapping(path = "/home", method = RequestMethod.GET, consumes = "application/json", produces = "application/json")
    public String home(){
        return "Hello, welcome to the API.";
    }
}
