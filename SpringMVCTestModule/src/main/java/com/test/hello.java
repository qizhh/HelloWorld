package com.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by fys on 2018/9/1.
 */
@Controller
@RequestMapping(value="/mvc")
public class hello {

    @RequestMapping(value="/testPathAnt/*/abc")
    public String testAntPath(){
        System.out.println("testAntPath");
        return "success";
    }

    @RequestMapping(value="/hello")
    public String testHello(){
        System.out.println("hello");
        return "success";
    }

    @RequestMapping(value="/testPathVariable/{id}")
    public String testPathVarible(@PathVariable("id") Integer id){
        System.out.println("var = " + id );
        return "success";
    }

}
