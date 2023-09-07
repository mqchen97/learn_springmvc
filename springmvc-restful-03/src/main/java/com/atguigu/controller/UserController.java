package com.atguigu.controller;

import com.atguigu.pojo.User;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    @PostMapping
    public Object save(@Validated @RequestBody User user, BindingResult result){
        System.out.println("user = " + user);
        if(result.hasErrors()){
            Map data = new HashMap<>();
            data.put("code", 400);
            data.put("message", "参数校验异常");
            return data;
        }
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
