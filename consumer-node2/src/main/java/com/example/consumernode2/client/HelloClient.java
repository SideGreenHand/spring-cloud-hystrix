package com.example.consumernode2.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "spring-cloud-producer2",fallback = HelloClientHystrix.class)
public interface HelloClient {
    @RequestMapping("/hello")
    String hello2(@RequestParam(value = "name") String name);
}
