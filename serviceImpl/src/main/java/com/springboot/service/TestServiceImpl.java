package com.springboot.service;


import com.alibaba.dubbo.config.annotation.Service;
import com.springboot.dubbo.service.TestService;

@Service(version = "1.0", application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",registry = "${dubbo.registry.id}")
public class TestServiceImpl implements TestService {

    @Override
    public String getDate(String name) {
        return "result===="+name;
    }
}
