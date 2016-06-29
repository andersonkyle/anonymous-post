package com.example.post.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/rest")
@RestController
public class AjaxController {

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public String get(){
        return "GET";
    }
    
    @RequestMapping(value = "/post", method = RequestMethod.POST)
    public void post(){
        System.out.println("POST METHOD CALLED");
    }
}
