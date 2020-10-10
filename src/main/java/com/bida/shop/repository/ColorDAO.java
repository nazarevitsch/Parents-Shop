package com.bida.shop.repository;

import com.bida.shop.domain.Color;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ColorDAO extends JpaRepository<Color, Long> {
}
