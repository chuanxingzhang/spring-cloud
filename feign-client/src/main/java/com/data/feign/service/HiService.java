package com.data.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "SERVICE-HI")
public interface HiService {
    @RequestMapping(value = "/",method = RequestMethod.GET)
    String sayHello();
}
