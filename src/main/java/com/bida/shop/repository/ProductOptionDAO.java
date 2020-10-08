package com.bida.shop.repository;

import com.bida.shop.domain.ProductOption;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductOptionDAO extends JpaRepository<ProductOption, Long> {
}
