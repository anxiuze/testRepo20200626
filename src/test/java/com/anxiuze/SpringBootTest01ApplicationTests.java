package com.anxiuze;

import com.anxiuze.pojo.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class SpringBootTest01ApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    private Person person;

    @Autowired
    private ApplicationContext ioc;

    @Test
    public void showPerson(){
        System.out.println(person);
    }

    @Test
    public void test(){
        boolean b = ioc.containsBean("helloService");
        System.out.println(b);
    }

}
