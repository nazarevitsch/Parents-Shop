package com.bida.shop.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String getMainPage1(){
        return "index";
    }

    @GetMapping("/index")
    public String getMainPage2(){
        return "index";
    }
}