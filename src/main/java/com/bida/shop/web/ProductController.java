package com.bida.shop.web;

import com.bida.shop.domain.Product;
import com.bida.shop.service.ImageService;
import com.bida.shop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    @Autowired
    private ImageService imageService;

    @GetMapping("/products")
    public String getProducts(@RequestParam Long id, Model model){
        System.out.println(productService.getAllProductsByCategoryId(id));
        model.addAttribute("products", productService.getAllProductsByCategoryId(id));
        model.addAttribute("images", imageService.getAllImagesByProductId(id));
        return "products";
    }
}
