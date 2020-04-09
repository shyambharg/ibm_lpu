package com.example.dao;

import java.util.ArrayList;

import com.example.model.Task;
import com.example.model.ToDo;

public class DemoDao {
	int id = 0;
	Task objTask = new Task();
	ToDo objTodo;
	public void createTask(String toDoName)
	{
		objTask.addTodo(new ToDo(toDoName));
		System.out.println("todo added");
	}
	
	
	public ArrayList<ToDo> display()
	{
		return objTask.display();

	}
	
	

}
