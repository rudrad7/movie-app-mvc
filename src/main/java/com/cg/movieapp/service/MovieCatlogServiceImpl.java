package com.cg.movieapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.movieapp.dao.MovieCatlogRepository;
import com.cg.movieapp.entity.MovieCatalog;

@Service
public class MovieCatlogServiceImpl  implements MovieCatalogService
{

	@Autowired
	MovieCatlogRepository movieCatlogRepository;
	
	//--------------------------------------------------
	@Override
	public MovieCatalog addMovieToCatalog(MovieCatalog movieCatalog) {
		
		return movieCatlogRepository.save(movieCatalog);
	}

}
