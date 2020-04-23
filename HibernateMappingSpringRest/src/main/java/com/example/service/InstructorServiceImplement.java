package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.InstructorDao;
import com.example.model.Instructor;

@Service
public class InstructorServiceImplement implements InstructorService {

	@Autowired
	private InstructorDao instructorDao;
	
	@Override
	public Instructor createInstructorService(Instructor instructor) {
		
		return instructorDao.createInstructor(instructor);
	}

}
