package com.data.feign.controller;

import com.data.feign.service.HiService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController

@Slf4j
public class HiController {
    @Resource
    HiService hiService;
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String sayHello(){
        log.info("call  feigin-client  /hi");

        return hiService.sayHello();
    }

}
