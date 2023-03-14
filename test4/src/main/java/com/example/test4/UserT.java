package com.example.test4;

public class UserT{
    private String name;

public UserT(){
    System.out.println("UserT被創建了");
}

public String getName(){
    return name;
}
public void setName(String name){
    this.name=name;
}
public void show(){
    System.out.println("name="+name+"好耶");
}
}
