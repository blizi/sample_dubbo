package com.blizi.hello.dubbo.service.user.provider.api.imple;

import com.alibaba.dubbo.config.annotation.Service;
import com.blizi.hello.dubbo.service.user.api.UserService;

@Service(version = "0.0.1")
public class UserServiceImpl implements UserService {
    @Override
    public String sayHi() {
        return "hello world";
    }
}
