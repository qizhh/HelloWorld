package com.ceshi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class test {
    @RequestMapping(value = "/helloWorld")
    public String helloWorld(){
        System.out.println("进入helloword方法");
        return "success";
    }
}
