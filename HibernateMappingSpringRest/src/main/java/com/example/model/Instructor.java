package com.example.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="instructor")
public class Instructor implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2735117253622765732L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	String firstName;
	String lastName;
	
	@OneToOne(cascade=CascadeType.ALL,targetEntity= InstructorDetails.class)
	@JoinColumn(name="instructorId")
	InstructorDetails details;
	
	

	public Instructor(int id, String firstName, String lastName, InstructorDetails details) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.details = details;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public InstructorDetails getDetails() {
		return details;
	}

	public void setDetails(InstructorDetails details) {
		this.details = details;
	}

	
}
