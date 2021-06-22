package com.alibaba.cloud;

public interface FooService {

    String sayHello(String name);

    long getCurrentTime(boolean slow);
}
