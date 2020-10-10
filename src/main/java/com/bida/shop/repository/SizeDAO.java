package com.bida.shop.repository;

import com.bida.shop.domain.Size;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SizeDAO extends JpaRepository<Size, Long> {
}
