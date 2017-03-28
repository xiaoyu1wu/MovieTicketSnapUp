package com.wxy.work.controller;

import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.wxy.work.entity.Movie;
import com.wxy.work.entity.MovieComment;
import com.wxy.work.service.MovieCommentService;
import com.wxy.work.service.MovieService;
import com.wxy.work.util.Page;

@Controller
@RequestMapping("/common")
public class CommonController {
	private static final Logger LOGGER = Logger.getLogger(CommonController.class);
	
	@Autowired
	private MovieService movieService;
	
	@Autowired
	private MovieCommentService movieCommentService;
	
	@RequestMapping(value="/index")
	private String index(
						@RequestParam(value="movie", required=false) String movie, 
						@RequestParam(value="type", defaultValue="all", required=false)  String movieType, 
						@RequestParam(value="pageNo", defaultValue= "1", required=false) Integer pageNo, 
						@RequestParam(value="pageSize", defaultValue="10", required=false) Integer pageSize, 
						ModelMap modelMap, HttpServletRequest request, HttpSession session){

		Page page = null;
		if("all".equals(movieType)){
			page = movieService.queryForPage(pageNo, pageSize);
		}
		else{
			page = movieService.queryForPage(pageNo, pageSize, movieType);
		}
		if(page!=null){
			modelMap.addAttribute("page", page);
			List<Movie> movies = page.getList();
			modelMap.addAttribute("movies", movies);
		}
		LOGGER.debug("进入首页");
		return "/common/index";
	}
	
	@RequestMapping(value="/showMovie")
	private String showMovie(
						@RequestParam(value="id", required=true) Integer movieId,
						ModelMap modelMap, HttpServletRequest request, HttpSession session){
		
		Movie movie = movieService.findMovie(movieId);
		modelMap.addAttribute("movie", movie);
		
		List<MovieComment> comments = movieCommentService.findMovieComment(movieId);
		modelMap.addAttribute("comments", comments);
		return "/common/movieDetail";
	}
}
