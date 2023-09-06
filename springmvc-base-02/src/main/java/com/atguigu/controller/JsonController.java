package com.atguigu.controller;

import com.atguigu.pojo.Person;
import com.atguigu.pojo.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/json")
public class JsonController {

    @PostMapping("/add")
    public String data(@RequestBody Person person){
        System.out.println("person = " + person);
        return person.toString();
    }

    @GetMapping("/data")
    public User data(){
        User user = new User();
        user.setName("张三");
        user.setAge(18);
        return user;
    }

    @GetMapping("/data2")
    public List<User> data2(){
        ArrayList<User> users = new ArrayList<>();
        User user = new User();
        user.setName("张三");
        user.setAge(18);
        users.add(user);
        return users;
    }


}
