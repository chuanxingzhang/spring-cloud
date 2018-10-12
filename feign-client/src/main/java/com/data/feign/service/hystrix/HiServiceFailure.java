package com.data.feign.service.hystrix;

import com.data.feign.service.HiService;
import org.springframework.stereotype.Component;

@Component
public class HiServiceFailure implements HiService {
    @Override
    public String sayHello() {
        System.out.println("hi service is not available !");
        return "hi service is not available !";    }
}
