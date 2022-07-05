package com.socialmediaproj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.socialmediaproj.entities.User;
import com.socialmediaproj.repository.UserRepository;



public class UserController {
	@Autowired
	private UserRepository repository;
	
	@PostMapping("/addUser")
	public String saveBook(@RequestBody User user) {
		repository.save(user);
		return "Added book with id: "+ user.getId();
}
}
