package com.company.ex.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.company.ex.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping 
	public ResponseEntity<User> findAll() {
		User u = new User(1L, "Iann", "iann@email.com", "9999999999", "123456");
		return ResponseEntity.ok().body(u);
	}
}
