package com.atguigu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/user")
public class UserController {

    @GetMapping("/")
    public String index(){
        return null;
    }

    @PostMapping(value = "/login")
    public String login(){
        return null;
    }

    @RequestMapping(value = "/register", method = {RequestMethod.POST, RequestMethod.PUT})
    public String register(){
        return null;
    }
}
