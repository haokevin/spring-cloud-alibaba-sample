package com.alibaba.cloud.nacosconfigsample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(User.class)
public class NacosConfigSampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosConfigSampleApplication.class, args);
    }

}
