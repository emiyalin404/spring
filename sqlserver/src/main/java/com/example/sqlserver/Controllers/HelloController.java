package com.example.sqlserver.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.sqlserver.Classes.RspBody;

// 標記為Restful API Controller
@RestController
public class HelloController {
 
    // 標記HTTP Get方法，並設定URL的路由
    @GetMapping("/hello")
    public RspBody Hello() {
        return new RspBody("0000", "Success", "Hello World");
    }
}