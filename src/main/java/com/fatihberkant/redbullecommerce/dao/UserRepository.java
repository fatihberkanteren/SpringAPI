package com.fatihberkant.redbullecommerce.dao;

import com.fatihberkant.redbullecommerce.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
