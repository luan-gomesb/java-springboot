package com.luangomesb.learning.resources;

import java.util.List;

import javax.websocket.server.PathParam;

import com.luangomesb.learning.entities.Category;
import com.luangomesb.learning.services.CategoryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {

  @Autowired
  CategoryService categoryService;

  @GetMapping
  public ResponseEntity<List<Category>> findAll() {
    List<Category> allCategories = categoryService.findAll();
    return ResponseEntity.ok().body(allCategories);
  }

  @GetMapping(value = "/{id}")
  public ResponseEntity<Category> findById(@PathVariable Long id) {
    Category category = categoryService.findById(id);
    return ResponseEntity.ok().body(category);
  }
}
