package com.bida.shop.service;

import com.bida.shop.domain.Product;
import com.bida.shop.repository.ProductDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductDAO productDAO;

    public List<Product> getAllProducts(){
        return productDAO.findAll();
    }

    public List<Product> getAllProductsByCategoryId(Long id){
        return productDAO.findAllByCategoryId(id);
    }

    public void save(Product product){
        productDAO.save(product);
    }

    public Product getProductById(Long id){
        return productDAO.findProductById(id);
    }

}
