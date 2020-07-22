package com.anxiuze;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

//@ImportResource(locations = {"classpath:bean.xml"})
@SpringBootApplication
@MapperScan("com.anxiuze.dao")
public class SpringBootTest01Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootTest01Application.class, args);
    }

}
