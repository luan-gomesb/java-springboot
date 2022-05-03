package com.luangomesb.learning.services;

import java.util.List;
import java.util.Optional;

import com.luangomesb.learning.entities.Category;
import com.luangomesb.learning.repositories.CategoryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {
  @Autowired
  private CategoryRepository categoryRepository;

  public List<Category> findAll() {
    return categoryRepository.findAll();
  }

  public Category findById(Long id) {
    Optional<Category> optCategory = categoryRepository.findById(id);
    return optCategory.get();
  }
}
