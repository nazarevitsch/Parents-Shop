package com.bida.shop.repository;

import com.bida.shop.domain.Image;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImageDAO extends JpaRepository<Image, Long> {
}
