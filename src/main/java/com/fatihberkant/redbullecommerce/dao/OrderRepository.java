package com.fatihberkant.redbullecommerce.dao;

import com.fatihberkant.redbullecommerce.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
