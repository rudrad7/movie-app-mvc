package com.cg.movieapp.controller;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cg.movieapp.model.MovieCatalog;
import com.cg.movieapp.service.MovieCatalogService;
@Controller
@RequestMapping("/movie")
public class MovieController 
{
//-------------------------------------
	// add an initbinder ... to convert trim input strings
	// remove leading and trailing whitespace
	// resolve issue for our validation
	//---http://localhost:8080/movie/showIndexPage
	
	@Autowired
	private MovieCatalogService movieCatalogService;
	//-----------------------------------------
	@RequestMapping("/showIndexPage")
	public String showIndexPage() {
				
		return "index";
	}
	//-------------------------------------
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) 
	{
		
		StringTrimmerEditor stringTrimmerEditor =
				new StringTrimmerEditor(true);
		
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}
	//----http://localhost:8080/movie/showAddMovieForm------------
		@RequestMapping("/showAddMovieForm")
	public String showForm(Model theModel) {
		
		theModel.addAttribute("movie", new MovieCatalog());
		
		return "add-movie";
	}
	
	@RequestMapping("/addMovie")
	public ModelAndView processForm(@Valid 
			@ModelAttribute("movie")
			MovieCatalog theMovie,
			BindingResult theBindingResult) {
		
		if (theBindingResult.hasErrors()) {
			ModelAndView mv = new 
					ModelAndView("add-movie",
							"movieError", " Some  Validation errro");
		    return mv;
		}
		else {
			
			com.cg.movieapp.entity.MovieCatalog movieCatalogEntity = 
					new com.cg.movieapp.entity.MovieCatalog(
							theMovie.getMovieId(),
							theMovie.getMovieName());
			
			com.cg.movieapp.entity.MovieCatalog savedMovie =
			movieCatalogService.addMovieToCatalog(movieCatalogEntity);
			ModelAndView mv = new 
					ModelAndView("movie-confirmation",
							"movie", savedMovie);
			
			return mv;
		}
	}
}












