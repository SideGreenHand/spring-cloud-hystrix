package com.example.consumernode1.client;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class HelloClientHystrix implements HelloClient {
    @Override
    public String hello(@RequestParam(value = "name") String name) {
        return "hello "+name+",producer is down";
    }
}
