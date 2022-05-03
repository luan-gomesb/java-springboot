package com.luangomesb.learning.services;

import java.util.List;
import java.util.Optional;

import com.luangomesb.learning.entities.Product;
import com.luangomesb.learning.repositories.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
  @Autowired
  private ProductRepository productRepository;

  public List<Product> findAll() {
    return productRepository.findAll();
  }

  public Product findById(Long id) {
    Optional<Product> optProduct = productRepository.findById(id);
    return optProduct.get();
  }
}
