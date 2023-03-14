package com.example.sqlserver.Classes;

public class RspBody {
       // 回傳狀態代碼(自定義)
       private String RspCode;
       // 回傳狀態訊息(自定義)
       private String RspMsg;
       // 回傳資料，型別為Object，讓回傳的資料型別可以更多樣化
       private Object RspData;
    
       public RspBody(String RspCode, String RspMsg, Object RspData) {
           this.RspCode = RspCode;
           this.RspMsg = RspMsg;
           this.RspData = RspData;
       }
    
       public String getRspCode() {
           return RspCode;
       }
    
       public void setRspCode(String RspCode) {
           this.RspCode = RspCode;
       }
    
       public String getRspMsg() {
           return RspMsg;
       }
    
       public void setRspMsg(String RspMsg) {
           this.RspMsg = RspMsg;
       }
    
       public Object getRspData() {
           return RspData;
       }
    
       public void setRspData(String RspData) {
           this.RspData = RspData;
       }
}
