package com.bida.shop.service;

import com.bida.shop.repository.ImageDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImageService {

    @Autowired
    private ImageDAO imageDAO;
}
