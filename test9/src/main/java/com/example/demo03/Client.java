package com.example.demo03;

public class Client {
    public static void main(String[] args) {
        //真實角色
        Host host =new Host();
        //代理角色: 現在沒有
        ProxyInvocationHandler pih=new ProxyInvocationHandler();
        //通過調用程序處理角色來處理我們要調用的接口對象!
        pih.setRent(host);

        Rent proxy=(Rent)pih.getProxy();//這裡的Proxy就是動態生成，我們並沒有寫他
        proxy.rent();
    }
}
