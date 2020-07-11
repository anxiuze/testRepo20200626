package com.anxiuze.controller;

import com.anxiuze.po.user.TUser;
import com.anxiuze.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author anxiuze
 * @date 2020/6/26 21:56
 * @Description:
 */
@RestController
@RequestMapping("/test")
public class HelloController {

    @Autowired
    private HelloService helloService;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello(){
        return helloService.sayHello();
    }

    @RequestMapping(value = "/queryAll", method = RequestMethod.GET)
    public TUser queryAll(){
        return helloService.queryAll();
    }
}
