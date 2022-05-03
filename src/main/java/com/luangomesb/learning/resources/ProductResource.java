package com.luangomesb.learning.resources;

import java.util.List;

import com.luangomesb.learning.entities.Product;
import com.luangomesb.learning.services.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/products")
public class ProductResource {

  @Autowired
  ProductService productService;

  @GetMapping
  public ResponseEntity<List<Product>> findAll() {
    List<Product> allProducts = productService.findAll();
    return ResponseEntity.ok().body(allProducts);
  }

  @GetMapping(value = "/{id}")
  public ResponseEntity<Product> findById(@PathVariable Long id) {
    Product product = productService.findById(id);
    return ResponseEntity.ok().body(product);
  }
}
