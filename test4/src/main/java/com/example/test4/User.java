package com.example.test4;

public class User {
    private String name;

// public User(){
//     System.out.println("User的無參構造");
// }
public  User(String name){
    this.name=name;
}
    public String getName(){
       return name; 
    }
    public void setName(String name){
        this.name=name;
    }
    public void show(){
        System.out.println("name="+name);
    }
}
