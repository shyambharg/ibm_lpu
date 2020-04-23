package com.example.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.model.Instructor;

@Repository
public class InstructorDaoImplement implements InstructorDao {

	
	@Autowired
	private SessionFactory sessionFactory;
		
	
	@Override
	public Instructor createInstructor(Instructor instructor) {
		
		Session currentSession = sessionFactory.openSession();
		currentSession.getTransaction().begin();
		currentSession.saveOrUpdate(instructor);
		currentSession.getTransaction().commit();
		return instructor;
	}

}
