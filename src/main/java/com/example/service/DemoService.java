package com.example.service;

import java.util.ArrayList;

import com.example.dao.DemoDao;
import com.example.model.ToDo;

public class DemoService {
	
	DemoDao objDao = new DemoDao();
	
	public void createToDoService(String toDoName)
	{
		objDao.createTask( toDoName);
	}
	
	public ArrayList<ToDo> display()
	{

		return objDao.display();

	}

}
