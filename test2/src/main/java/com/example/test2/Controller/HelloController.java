package com.example.test2.Controller;

// 載入以下兩個Library
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String Hello() {
        // 回傳Hello World字串
        return "Hello World";
    }
}
