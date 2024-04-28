package com.fatihberkant.redbullecommerce.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "orders")
@Getter
@Setter
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "orders")
    private Set<User> users;

    @Column(name = "user_id")
    private int userId;

    @Column(name = "order_date")
    private Date orderDate;

    @Column(name = "total_amount")
    private float totalAmount;

    @Column(name = "status")
    private int status;
}
