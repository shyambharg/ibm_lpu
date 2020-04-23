package com.example.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Instructor;
import com.example.service.InstructorService;

@RestController
@RequestMapping("/api")
public class InstructorController {

	@Autowired
	private InstructorService instructorService;
	
	@PostMapping("/instructor")
	public Instructor create(@RequestBody Instructor instructor)
	{
		return instructorService.createInstructorService(instructor);
	}
	
	@GetMapping("/hiii")
	public String display()
	{
		return "hii";
	}
}
