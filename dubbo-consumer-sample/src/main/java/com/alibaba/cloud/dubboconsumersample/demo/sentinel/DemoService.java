package com.alibaba.cloud.dubboconsumersample.demo.sentinel;

import org.springframework.stereotype.Service;

@Service
public class DemoService {

    public String bonjour(String name) {
        return "Bonjour, " + name;
    }
}
