package com.luangomesb.learning.resources;

import com.luangomesb.learning.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.luangomesb.learning.entities.User;

import java.util.List;

@RestController
@RequestMapping(value = "/users")

public class UserResource {

	@Autowired
	UserService userService;

	@GetMapping
	public ResponseEntity<List<User>> findAll() {
		List<User> usersList = userService.findAll();
		return ResponseEntity.ok().body(usersList);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<User> findById(@PathVariable Long id) {
		User user = userService.findById(id);
		return ResponseEntity.ok().body(user);
	}
}
