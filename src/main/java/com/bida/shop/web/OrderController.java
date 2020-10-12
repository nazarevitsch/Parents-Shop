package com.bida.shop.web;

import com.bida.shop.domain.OrderFromWeb;
import com.bida.shop.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/create_order")
    public ResponseEntity creatOrder(@RequestBody OrderFromWeb order){
        orderService.sendNotification(order);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}
