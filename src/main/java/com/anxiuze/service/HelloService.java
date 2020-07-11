package com.anxiuze.service;

import com.anxiuze.dao.TUserMapper;
import com.anxiuze.po.user.TUser;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author anxiuze
 * @date 2020/6/27 18:19
 * @Description:
 */
@Slf4j
public class HelloService {

    @Autowired
    private TUserMapper userMapper;

    public String sayHello(){
        log.info("this is hello log:{}","haha");
        return "hello World!";
    }

    public TUser queryAll(){
        return (TUser) userMapper.selectByExample(null);
    }


}
