package com.cssl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by tym on 2018/7/19 0019.
 */
@Controller
public class MyController {

    /**
     * 新加注释
     * @return
     */
    @RequestMapping("/index.action")
    public String index(){
        System.out.println("index:");
        return "index";
    }

}
