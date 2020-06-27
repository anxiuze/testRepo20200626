package com.anxiuze.config;

import com.anxiuze.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author anxiuze
 * @date 2020/6/27 18:28
 * @Description:
 */
@Configuration
public class HelloConfig {

    @Bean
    public HelloService helloService(){
        return new HelloService();
    }

}
