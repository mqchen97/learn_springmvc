package com.atguigu.controller;

import com.atguigu.pojo.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {
    @GetMapping
    public List<User> page(
            @RequestParam(required = false,defaultValue = "1") int page,
            @RequestParam(required = false,defaultValue = "10") int pageSize
    ){
        System.out.println("page = " + page + ", pageSize = " + pageSize);
        return null;
    }

    public User save(@RequestBody User user){
        System.out.println("user = " + user);
        return user;
    }

    @GetMapping("{id}")
    public User detail(@PathVariable String id){
        return null;
    }

    @PutMapping
    public User update(){
        return null;
    }

    @DeleteMapping("{id}")
    public User delete(@PathVariable String id){
        return null;
    }

    @GetMapping("search")
    public List<User> search(
            String id,
            @RequestParam(required = false,defaultValue = "1") int page,
            @RequestParam(required = false,defaultValue = "10") int pageSize
    ){
        return null;
    }

}
