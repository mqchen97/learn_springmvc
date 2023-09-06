package com.atguigu.controller;

import com.atguigu.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/param")
public class ParamController {
    @RequestMapping("/data")
    @ResponseBody
    public String data(String name, int age){
        System.out.println("name = " + name + ", age = " + age);
        return "name = " + name + ", age = " +  age;
    }

    @RequestMapping("/list")
    @ResponseBody
    public String list(
            @RequestParam("account") String username,
            @RequestParam(required = false, defaultValue = "18") int age
    ){
        System.out.println("username = " + username + ", age = " + age);
        return "username = " + username + ", age = " + age;
    }

    @RequestMapping("/user")
    @ResponseBody
    public String user(User user
    ){
        System.out.println("user = " + user);
        return user.toString();
    }

    @RequestMapping("/delete/{id}")
    @ResponseBody
    public String delete(@PathVariable("id") String userId){
        System.out.println("userId = " + userId);
        return "userId = " + userId;
    }
}
