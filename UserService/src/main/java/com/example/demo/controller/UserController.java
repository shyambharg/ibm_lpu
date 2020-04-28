package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.controller.exception.UserNotFoundException;
import com.example.demo.model.User;
import com.example.demo.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	
	@GetMapping("users/{id}")
	public User getUserById(@PathVariable Integer id) throws UserNotFoundException
	{
		User user = userService.getUserById(id);
		 if(user!=null)
		 {
			 return userService.getUserById(id);
		 }
		 else
		 {
			 throw new UserNotFoundException("User id -- "+id+" not allowed to see the movie list ");
		 }
		 
			 
	}
	
	
}
