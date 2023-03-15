package com.example.diy;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect //標註這個類是一個切面
public class AnnotationPointCut {
    @Before("execution(* com.example.test10.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("*****方法執行前*****");
    }
    @After("execution(* com.example.test10.UserServiceImpl.*(..))")
    public void after(){
        System.out.println("*****方法執行後*****");
    }

    //在環繞增強中，我們可以給定一個參數，代表我們要獲取處理切入的點
    @Around("execution(* com.example.test10.UserServiceImpl.*(..))")
    public void around(){
        
    }
}
