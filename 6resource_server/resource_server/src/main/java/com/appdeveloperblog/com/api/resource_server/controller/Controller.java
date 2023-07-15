package com.appdeveloperblog.com.api.resource_server.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class Controller {

    @GetMapping("status/check")
    public String status(){
        return "Working";
    }
}
