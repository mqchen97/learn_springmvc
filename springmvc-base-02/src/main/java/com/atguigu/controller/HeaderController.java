package com.atguigu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
@RequestMapping("header")
public class HeaderController {

    @RequestMapping("host")
    public String host(@RequestHeader("Host") String host){
        System.out.println("host = " + host);
        return "host = " + host;
    }
}
