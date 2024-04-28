package com.fatihberkant.redbullecommerce.dao;

import com.fatihberkant.redbullecommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
