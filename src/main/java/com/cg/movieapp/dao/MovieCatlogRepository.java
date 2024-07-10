package com.cg.movieapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.movieapp.entity.MovieCatalog;

@Repository
public interface MovieCatlogRepository  extends 
JpaRepository<MovieCatalog, Integer>
{

}
