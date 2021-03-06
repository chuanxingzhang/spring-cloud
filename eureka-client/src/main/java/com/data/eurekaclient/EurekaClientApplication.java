package com.data.eurekaclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Configuration
@EnableAutoConfiguration
@EnableEurekaClient
@RestController
public class EurekaClientApplication {

    @Value("${server.port}")
    String port;
    @RequestMapping("/hi")
    public String home() {
        return "hi ,i am from port:" +port;
    }
    @RequestMapping("/hi2")
    public String home2() {
        return "hi i am from port:" +port;
    }
    public static void main(String[] args) {
        SpringApplication.run(EurekaClientApplication.class, args);
    }}
