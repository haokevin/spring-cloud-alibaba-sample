package com.alibaba.cloud.dubboprovidersample.demo.sentinel;

import com.alibaba.cloud.FooService;
import org.apache.dubbo.config.annotation.DubboService;


@DubboService
public class FooServiceImpl implements FooService {

    @Override
    public String sayHello(String name) {
        return "Hello, " + name;
    }

    @Override
    public long getCurrentTime(boolean slow) {
        if (slow) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException ignored) {
            }
        }
        return System.currentTimeMillis();
    }
}