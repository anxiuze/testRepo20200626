package com.anxiuze.controller;

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

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello(){
        return "hello world!";
    }

}
