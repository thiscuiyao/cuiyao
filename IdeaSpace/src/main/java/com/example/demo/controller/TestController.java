package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/TestController/a/ /")//空格也可以访问。不加这行，可直接访问方法
public class TestController {

    @RequestMapping("/test")
    public String test(){
        return "12345";
    }

}
