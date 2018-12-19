package com.example.consumernode1.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "spring-cloud-producer",fallback = HelloClientHystrix.class)
public interface HelloClient {
    @RequestMapping("/hello")
    String hello(@RequestParam(value = "name") String name);
}
