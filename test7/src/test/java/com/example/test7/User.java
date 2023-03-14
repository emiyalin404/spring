package com.example.test7;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//等價於<bean id="user" class="com.example.dao.User"/>
//@Component 組件
@Component
@Scope("prototype")
public class User {
    // @Value("好耶~~~~")
    public String name;

    //相當於<property name="name" value="kuangsher"/>
    @Value("kuangsher")
    public void setName(String name) {
        this.name = name;
    }
}
