package com.example.demo02;


//真實對象
public class UserServiceImpl implements UserService{
    public void add(){
        System.out.println("使用了add方法");
System.out.println("增加了一個用戶");
    }
    public void delete(){
        System.out.println("刪除了一個用戶");
    }
    public void update(){
        System.out.println("修改了一個用戶");
    }
    public void query(){
        System.out.println("查詢了一個用戶");
    }
}
