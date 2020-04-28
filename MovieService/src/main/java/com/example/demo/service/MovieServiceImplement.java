package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.dao.MovieDao;
import com.example.demo.model.Movie;

@Service
public class MovieServiceImplement implements MovieService{

	@Autowired
	private MovieDao movieDao;
	
	@Autowired
	private RestTemplate restTemplate;
	
	
	@Override
	public List<Movie> listAllById(Integer id) 
	{
		
		List<Movie> movies= new ArrayList<Movie>();
		
		movieDao.findAll().forEach(movie -> { movies.add(new Movie(movie.getMovieName(),movie.getGenre()));}
		);
		if(restTemplate.getForObject("http://user-service/users/"+id, Object.class)!=null) 
		{
		return movies;
		}
		else
		{
			return null;
		}
	}

	
}
