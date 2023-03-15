package com.example.log;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class Log implements MethodBeforeAdvice{

    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
       System.out.println(target.getClass().getName()+"的"+method.getName()+"被執行了");
    }
    
}
