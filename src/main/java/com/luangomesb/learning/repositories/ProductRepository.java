package com.luangomesb.learning.repositories;

import com.luangomesb.learning.entities.Product;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}