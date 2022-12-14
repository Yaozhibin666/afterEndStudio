package com.example.yx_login3;



import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages ="com.example" )
@MapperScan(basePackages = "com.example.yx_login3.mapper")
public class YxLogin3Application {

    public static void main(String[] args) {
        SpringApplication.run(YxLogin3Application.class, args);
    }

}
