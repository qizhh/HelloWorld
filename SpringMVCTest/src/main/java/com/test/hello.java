package com.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by fys on 2018/9/1.
 */
@Controller
@RequestMapping(value="/mvc")
public class hello {
    @RequestMapping(value="/hello")
    public String hello(){
        System.out.println("hell0");
        return "success";
    }
}
