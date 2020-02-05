package com.ping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//控制器
@Controller
@RequestMapping("/user")
public class hello {
   @RequestMapping("/hello")
    public  String sayHello(){
        System.out.println("hello String MVC");
        return  "success";
    }
    @RequestMapping(path = "/RequestMapping")
    public String testRequestMapping(){
        System.out.println("测试RequestMapping");
        return "success";
    }


}
