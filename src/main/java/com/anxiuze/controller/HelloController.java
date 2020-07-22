package com.anxiuze.controller;

import com.anxiuze.po.user.TUser;
import com.anxiuze.service.HelloService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author anxiuze
 * @date 2020/6/26 21:56
 * @Description:
 */
@RestController
@RequestMapping("/test")
@Api(value = "首个接口",tags = "首个接口实例！")
public class HelloController {

    @Autowired
    private HelloService helloService;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    @ApiOperation(value = "hello接口")
    public String hello(){
        return helloService.sayHello();
    }

    @RequestMapping(value = "/queryAll", method = RequestMethod.GET)
    @ApiOperation(value = "查询所有用户")
    public List<TUser> queryAll(){
        return helloService.queryAll();
    }
}
