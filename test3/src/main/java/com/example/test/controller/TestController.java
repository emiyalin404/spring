package com.example.test.controller;
//載入library
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.Classes.RspBody;
//標記為Restful API Contronller
@RestController
public class TestController {

    //標記HTTP Getz方法，並設定UPL路由
    @GetMapping("/hello")
    // public String Hello() {
    //     //回傳Hello字串
    //   return "好耶";
    // }
    public RspBody Hello(){
return new RspBody("0000","Success","Hello World 好耶");
    }
}
