package com.ping.controller;

import com.ping.domain.Account;
import com.ping.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("params")
public class params {
    @RequestMapping("/testParam")
    public String testParam( String username, String password){
        System.out.println("执行了");
        System.out.println(username+"  and  "+password);
        return  "success";
    }
    @RequestMapping("/saveAccount")
    public String saveAccount(Account account){
        System.out.println("执行了");
        System.out.println(account);
        return  "success";

    }
    @RequestMapping("/saveUser")
    public String saveUser(User user){
        System.out.println("执行了");
        System.out.println(user);
        return  "success";
    }
}
