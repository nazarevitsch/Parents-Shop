package com.bida.shop.web;

import com.bida.shop.service.ImageService;
import com.bida.shop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ItemController {

    @Autowired
    private ProductService productService;

    @Autowired
    private ImageService imageService;

    @GetMapping("/item")
    public String getItem(@RequestParam("id") Long id, Model model){
        model.addAttribute("images", imageService.getAllImagesByProductId(id));
        model.addAttribute("product", productService.getProductById(id));
        return "item";
    }
}
