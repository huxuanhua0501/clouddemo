package com.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class Service2Application {
    @GetMapping(value = "service")
    public String service() {
        System.err.println("333");
        return "service3";
    }

    public static void main(String[] args) {
        SpringApplication.run(Service2Application.class, args);
    }
}
