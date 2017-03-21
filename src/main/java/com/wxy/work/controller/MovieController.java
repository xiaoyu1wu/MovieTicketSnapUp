package com.wxy.work.controller;

import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wxy.work.entity.Movie;
import com.wxy.work.entity.ScreenSchedule;

@Controller
@RequestMapping("/movie")
public class MovieController {
	private static final Logger LOGGER = Logger.getLogger(MovieController.class);
	
	/*@Autowired
	private MovieService movieService;*/
	
	/*@RequestMapping("/getMovieList")
	public List<Movie> getMovieList(ModelMap modelMap, @PathVariable Date day, @PathVariable String cinema){
		LOGGER.info("获取所有的电影排片");
		List<Movie> screenSchedules = movieService.getMovieList(day, cinema);
		return screenSchedules;
	}*/
}
