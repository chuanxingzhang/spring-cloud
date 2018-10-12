package com.data.feign.controller;

import com.data.feign.service.HiService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class HiController {
    @Resource
    HiService hiService;
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String sayHello(){
        return hiService.sayHello();
    }

}
