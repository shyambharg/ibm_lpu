package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="instructordetails")
public class InstructorDetails {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "instructorId")
	int instructorId;
	String email;
	String address;
	int age;
	
	public int getInstructorId() {
		return instructorId;
	}
	public void setInstructorId(int instructorId) {
		this.instructorId = instructorId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public InstructorDetails(int instructorId, String email, String address, int age) {
		super();
		this.instructorId = instructorId;
		this.email = email;
		this.address = address;
		this.age = age;
	}
	
	
	
	
//	create table instructordetails (email varchar(255), address varchar(255), age int, instructorId int,FOREIGN KEY (instructorId) REFERENCES instructor(id))	

}
