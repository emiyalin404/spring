package com.example.test10;

public class UserServiceImpl implements UserService{
    public void add(){
        System.out.println("增加了一個用戶");
    }
    public void delete(){
        System.out.println("刪除了一個用戶");
    }
    public void update(){
        System.out.println("更新了一個用戶");
    }
    public void select(){
        System.out.println("查詢了一個用戶");
    }

}
