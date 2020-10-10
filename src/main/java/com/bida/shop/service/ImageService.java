package com.bida.shop.service;

import com.bida.shop.domain.Image;
import com.bida.shop.repository.ImageDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImageService {

    @Autowired
    private ImageDAO imageDAO;

    public List<Image> getAllImagesByProductId(Long id){
        return imageDAO.getImagesByProductId(id);
    }
}
