package com.example.sqlserver.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MyController {
    @GetMapping("/hello-one")
    public String hello(@RequestParam(required=false)String id){
        return "Hello"+(id==null ? "World" : id)+ "from One!!!";
    }
}
