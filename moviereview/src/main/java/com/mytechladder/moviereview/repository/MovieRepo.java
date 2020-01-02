package com.mytechladder.moviereview.repository;

import org.springframework.data.repository.CrudRepository;

import com.mytechladder.moviereview.model.Movie;

public interface MovieRepo extends CrudRepository<Movie,Integer> {
	
	Movie findByTitle(String title);

}
