package com.example.demo01;

public class Client {
    public static void main(String[] args) {
        //房東要租房子
        Host host=new Host();
    //代理，仲介幫房東租房子，但是呢?代理角色一般會有一些附屬操作
    Proxy proxy=new Proxy(host);
    //你不用面對房東，直接找仲介租房即可!
    proxy.rent();
    }
}
