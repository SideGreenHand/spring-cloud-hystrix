package com.example.consumernode2.client;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class HelloClientHystrix implements HelloClient {
    @Override
    public String hello2(@RequestParam(value = "name") String name) {
        return "hello "+name+",producer is down";
    }
}
