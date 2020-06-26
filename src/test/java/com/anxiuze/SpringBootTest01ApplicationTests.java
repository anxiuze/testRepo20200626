package com.anxiuze;

import com.anxiuze.pojo.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootTest01ApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    private Person person;

    @Test
    public void showPerson(){
        System.out.println(person);
    }

}
