package com.wxy.work.controller;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wxy.work.entity.Movie;
import com.wxy.work.entity.Screen;
import com.wxy.work.service.MovieService;
import com.wxy.work.service.ScreenService;

@Controller
@RequestMapping("/screen")
public class ScreenController {
	
	private static final Logger LOGGER = Logger.getLogger(ScreenService.class);
	
	@Autowired
	private ScreenService screenService;
	@Autowired
	private MovieService movieService;
	
	/**
	 * 根据日期、电影、电影院获取所有排片，返回json数据
	 * @param modelMap
	 * @param day
	 * @param cinemaId
	 * @param movie
	 * @return
	 * @throws ParseException
	 */
	@RequestMapping(value = "/getScreenList", method=RequestMethod.POST)
	private @ResponseBody List<Screen> getScreenList(ModelMap modelMap, @RequestParam String day, @RequestParam String cinemaId, @RequestParam String movie) throws ParseException {
		LOGGER.info("获取电影名为【" + movie + "】的排片");
		LOGGER.info("day:" + day);
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");//小写的mm表示的是分钟
		Date date=sdf.parse(day); 
		List<Screen> screens = screenService.getScreenList(date, Integer.valueOf(cinemaId), movie);
		return screens;
	}
//	@RequestMapping(value = "/getScreenList", method=RequestMethod.GET)
//	private @ResponseBody List<Screen> getScreenList() throws ParseException{
//		Date date=sdf.parse("2017-3-27");
//		List<Screen> screens = screenService.getScreenList(date, 1, "刺客信条");
	
	/**
	 * 跳转到电影排片页面
	 * @param modelMap
	 * @return
	 * @throws ParseException
	 * @throws UnsupportedEncodingException 
	 */
	@RequestMapping(value = "/showScreenList", method=RequestMethod.GET)
	private String showScreenList(ModelMap modelMap, HttpServletResponse response, @RequestParam(value="movieId") Integer movieId) throws ParseException, UnsupportedEncodingException {
		Movie movie = movieService.findMovie(movieId);
		LOGGER.info("选择了movieid为" + movieId);
		response.addCookie(new Cookie("movieName", URLEncoder.encode(movie.getMovieName(), "UTF-8")));
		return "/film/filmScreen";
	}
	
	
	@SuppressWarnings("deprecation")
	@RequestMapping(value = "/getScreenInfo", method=RequestMethod.POST)
	private @ResponseBody Map<String, Object> getScreenList(ModelMap modelMap, @RequestParam Integer screenId) throws ParseException {
		LOGGER.info("获取排片id为【" + screenId + "】的排片");
		Screen screen = screenService.get(screenId);
		Integer longTime = screen.getMovie().getTimeRange();
		@SuppressWarnings("deprecation")
		String endTime = new Date(screen.getOpenTime().getTime() + longTime*60*1000).toLocaleString();
		
		Map<String, Object> resMap = new HashMap<String, Object>();
		resMap.put("movieName", screen.getMovie().getMovieName());
		resMap.put("cinemaName", screen.getCinema().getName());
		resMap.put("moviePath", screen.getMovie().getPicturePath());
		resMap.put("changci", screen.getOpenTime().toLocaleString() + " " + screen.getHall().getNumber() + "号厅");
		resMap.put("seatSum", screen.getHall().getAllCount());
		resMap.put("leftSeatCount", screen.getHall().getLeftSeatCount());
		resMap.put("language", screen.getMovie().getLanguage());
		resMap.put("endTime", endTime);
		resMap.put("danjia", screen.getDiscount()*screen.getMovie().getPrice());
		
		return resMap;
	}
	
	public static void main(String[] args) {
		Date date = new Date();
		long lg = date.getTime()+2*60*1000;
		System.out.println(date.toLocaleString());
		System.out.println(new Date(lg).toLocaleString());
	}
}
