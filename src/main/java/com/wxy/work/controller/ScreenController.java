package com.wxy.work.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

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
import com.wxy.work.service.ScreenService;

@Controller
@RequestMapping("/screen")
public class ScreenController {
	
	private static final Logger LOGGER = Logger.getLogger(ScreenService.class);
	
	@Autowired
	private ScreenService screenService;
	
	@RequestMapping(value = "/getScreenList", method=RequestMethod.POST)
	private @ResponseBody List<Screen> getScreenList(ModelMap modelMap, @RequestParam String day, @RequestParam String cinemaId, @RequestParam String movie) throws ParseException {
		LOGGER.info("获取所有的电影排片");
		LOGGER.info("day:" + day);
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");//小写的mm表示的是分钟
		Date date=sdf.parse(day); 
		
		List<Screen> screens = screenService.getScreenList(date, Integer.valueOf(cinemaId), movie);
		return screens;
	}
}
