package com.bida.shop.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductsController {

    @GetMapping("/products")
    public String getProducts(){
        return "products";
    }
}
