package com.bida.shop.service;

import com.bida.shop.repository.ProductOptionDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductOptionService {

    @Autowired
    private ProductOptionDAO productOptionDAO;
}
