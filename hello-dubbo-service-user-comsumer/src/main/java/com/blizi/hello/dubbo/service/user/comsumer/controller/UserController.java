package com.blizi.hello.dubbo.service.user.comsumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.blizi.hello.dubbo.service.user.api.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Reference(version = "0.0.1")
    private UserService userService;

    @RequestMapping("/hi")
    public String sayHi(){
        return userService.sayHi();
    }
}
