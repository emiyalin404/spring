package com.example.demo01;

public class Proxy {
    private Host host;

    public Proxy(){

    }
    public Proxy(Host host){
        this.host=host;
    }

    public void rent(){
        seeHouse();
        hetong();
        fare();
        host.rent();
    }
//看房
public void seeHouse(){
    System.out.println("仲介帶你看房");
}
//簽合同
public void hetong(){
    System.out.println("千租賃合同");
}
//收仲介費
public void fare(){
    System.out.println("收仲介費");
}
}
