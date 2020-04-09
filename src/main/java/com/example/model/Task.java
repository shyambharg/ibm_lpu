package com.example.model;

import java.util.ArrayList;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@EqualsAndHashCode
public class Task {
	ArrayList<ToDo> obj;
	private String taskId;
	
	{
		obj= new ArrayList<ToDo>();
		taskId=UUID.randomUUID().toString();
	}
	
	
	public void addTodo(ToDo obj1)
	{
		obj.add(obj1);
	}
	
	public ArrayList<ToDo> display()
	{
		return obj;
	}
	
	public void delete(String id)
	{
		obj.remove(id);
		System.out.println("object deleted");
	}
	
	public void update(String id)
	{
		
	}
}
