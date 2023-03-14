package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.example.test8.User;

//這個也會被Spring容器託管，註冊到容器中，因為他本就是一個@Component,@Configuration代表這是一個配置類，就和我們之前看的beans.xml
@Configuration
@ComponentScan("com.example.test8")
@Import(KuangConfig2.class)
public class KuangConfig {

    // 註冊一個bean，相當於我們之前寫的一個bean標籤
    // 這個方法的名字，就相當於bean標籤中的id屬性
    // 這個方法的返回值，就相當於bean標籤中的class屬性
    @Bean
    public User User() {
        return new User();// 就是返回要注入到bean的對象!
    }
}
