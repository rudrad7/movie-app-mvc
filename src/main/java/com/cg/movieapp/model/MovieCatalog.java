package com.cg.movieapp.model;
import java.io.Serializable;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
public class MovieCatalog  
{	

	private int movieId;
	private String movieName;
	public MovieCatalog() 
	{
		// TODO Auto-generated constructor stub
	}

	public MovieCatalog(int movieId) {
		super();
		this.movieId = movieId;
	}

	public MovieCatalog(int movieId, String movieName) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
	}

	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		System.out.println("set moviename called....");
		this.movieName = movieName;
	}


}
