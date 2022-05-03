package com.luangomesb.learning.repositories;

import com.luangomesb.learning.entities.Category;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}