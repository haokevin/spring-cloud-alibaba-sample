package com.alibaba.cloud.dubboconsumersample.demo.sentinel;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.stereotype.Service;

@Service
public class DemoService {

    @SentinelResource(value = "DemoService#bonjour", defaultFallback = "bonjourFallback")
    public String bonjour(String name) {
        return "Bonjour, " + name;
    }


}
