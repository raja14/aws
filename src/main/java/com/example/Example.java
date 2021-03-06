package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by rvivek on 5/2/2017.
 */
@RestController
@EnableAutoConfiguration
public class Example {

    @RequestMapping("/")
    String home(){
        String returnValue = "Welcome ";
        return returnValue+"Hello World!";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Example.class,args);
    }
}
