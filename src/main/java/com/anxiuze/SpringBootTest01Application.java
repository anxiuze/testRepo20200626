package com.anxiuze;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

//@ImportResource(locations = {"classpath:bean.xml"})
@SpringBootApplication
public class SpringBootTest01Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootTest01Application.class, args);
    }

}
