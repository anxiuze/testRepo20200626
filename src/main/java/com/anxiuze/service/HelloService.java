package com.anxiuze.service;

import lombok.extern.slf4j.Slf4j;
/**
 * @author anxiuze
 * @date 2020/6/27 18:19
 * @Description:
 */
@Slf4j

public class HelloService {
    public String sayHello(){
        log.info("this is hello log:{}","haha");
        return "hello World!";

    }

}
