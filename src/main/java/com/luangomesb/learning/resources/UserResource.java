package com.luangomesb.learning.resources;

import com.luangomesb.learning.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.luangomesb.learning.entities.User;

import java.net.URI;
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

	@PostMapping
	public ResponseEntity<User> saveUser(@RequestBody User obj) {
		User createdUser = userService.save(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{id}").buildAndExpand(createdUser.getId())
				.toUri();
		return ResponseEntity.created(uri).body(createdUser);
	}

	@PutMapping(value = "/{id}", consumes = "application/json")
	public ResponseEntity<User> updateUser(@PathVariable Long id, @RequestBody User obj) {
		obj = userService.update(id, obj);
		return ResponseEntity.ok().body(obj);
	}

	@DeleteMapping(value = "/{id}")
	public ResponseEntity<User> deleteUser(@PathVariable Long id) {
		userService.delete(id);
		return ResponseEntity.ok().body(null);
	}
}
