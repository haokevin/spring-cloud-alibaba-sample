package com.alibaba.cloud.dubboprovidersample;

import com.alibaba.cloud.EchoService;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService
public class SimpleEchoService implements EchoService {
    @Override
    public String echo(String s) {
        return "[echo] " + s;
    }
}
