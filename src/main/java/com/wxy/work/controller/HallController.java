package com.wxy.work.controller;

import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wxy.work.entity.Hall;
import com.wxy.work.service.HallService;
import com.wxy.work.service.ScreenService;

@Controller
@RequestMapping("/hall")
public class HallController {
private static final Logger LOGGER = Logger.getLogger(ScreenService.class);
	
	@Autowired
	private HallService hallService;
	
	private @ResponseBody Hall getSeatInfo(ModelMap modelMap, @RequestParam Integer hallId){
		Hall hall = hallService.getSeatInfo(hallId);
		return hall;
	}
}
