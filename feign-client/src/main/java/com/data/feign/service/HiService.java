package com.data.feign.service;

import com.data.feign.service.hystrix.HiServiceFailure;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "SERVICE-HI",fallback = HiServiceFailure.class)
public interface HiService {
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHello();
}
