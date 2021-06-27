package com.example.demo.demos.sentinel;

import org.springframework.stereotype.Service;

@Service
public class DemoService {

    public String bonjour(String name) {
        return "Bonjour, " + name;
    }
}
