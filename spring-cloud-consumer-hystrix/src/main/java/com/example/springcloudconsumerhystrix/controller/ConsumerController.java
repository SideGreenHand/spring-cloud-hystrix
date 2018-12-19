package com.example.springcloudconsumerhystrix.controller;


import com.example.springcloudconsumerhystrix.client.HelloClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class ConsumerController {
    @Resource
    HelloClient helloClient;

    @RequestMapping("/hello/{name}")
    public String index(@PathVariable String name){
        return helloClient.hello(name);
    }

}
