package com.alibaba.cloud.dubboconsumersample.demo.sentinel;

import com.alibaba.cloud.FooService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author Eric Zhao
 */
@RestController
@RequestMapping("/demo")
public class DemoController {

    @DubboReference
    private FooService fooService;

    @Autowired
    private DemoService demoService;

    @GetMapping("/hello")
    public String apiSayHello(@RequestParam String name) {
        return fooService.sayHello(name);
    }

    @GetMapping("/bonjour/{name}")
    public String apiSayHelloLocal(@PathVariable String name) {
        return demoService.bonjour(name);
    }

    @GetMapping("/time")
    public long apiCurrentTime(@RequestParam(value = "slow", defaultValue = "false") Boolean slow) {
        return fooService.getCurrentTime(slow);
    }
}

