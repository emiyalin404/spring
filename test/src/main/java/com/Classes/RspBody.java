package com.Classes;

public class RspBody {

    private String RspCode;
    private String RspMsg;
    private Object RspData;

    public RspBody(String RspCode,String RspMsg, Object RspData){
        this.RspCode=RspCode;
        this.RspMsg=RspMsg;
        this.RspData=RspData;
    }
    public String getRspCode(){
        return RspCode;
    }
    public void setRspCode(String RspCode){
        this.RspCode=RspCode;
    }
    public String getRspMsg(){
        return RspMsg;
    }
    public void setRspMsg(String RspMsg){
        this.RspMsg=RspMsg;
    }
    public Object getRspData(){
        return RspData;
    }
    public void setRspData(String RspData){
        this.RspData=RspData;
    }
}

