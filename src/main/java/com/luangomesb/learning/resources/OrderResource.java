package com.luangomesb.learning.resources;

import com.luangomesb.learning.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.luangomesb.learning.entities.Order;

import java.util.List;

@RestController
@RequestMapping(value = "/orders")
public class OrderResource {
	@Autowired
	OrderService orderService;

	@GetMapping
	public ResponseEntity<List<Order>> findAll() {
		List<Order> usersList = orderService.findAll();

		return ResponseEntity.ok().body(usersList);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Order> findById(@PathVariable Long id) {
		Order order = orderService.findById(id);
		return ResponseEntity.ok().body(order);
	}
}
