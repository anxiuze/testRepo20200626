package com.anxiuze.pojo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author anxiuze
 * @date 2020/6/26 23:11
 * @Description:
 */

@Data
@Component
@ConfigurationProperties(prefix = "person")
public class Person {
    private String name;
    private Integer age;
    private Date birth;
    private Map<String, String> map;
    private List<String> list;
    private Dog dog;

}
