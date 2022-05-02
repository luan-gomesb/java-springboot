package com.luangomesb.learning.repositories;

import com.luangomesb.learning.entities.Order;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}