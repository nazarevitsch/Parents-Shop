package com.bida.shop.repository;

import com.bida.shop.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductDAO extends JpaRepository<Product, Long> {

    List<Product> findAllByCategoryId(Long categoryId);

    Product findProductById(Long id);
}
