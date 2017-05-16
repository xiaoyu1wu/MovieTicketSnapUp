package com.wxy.work.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.wxy.work.entity.Hall;
import com.wxy.work.entity.Screen;
import com.wxy.work.service.HallService;
import com.wxy.work.service.ScreenService;

@Controller
@RequestMapping("/cinema")
public class CinemaController {
	@Autowired
	private HallService hallService;
	@Autowired
	private ScreenService screenService;
	
	@RequestMapping(value = "/showSeatPlan")
	public String showSeatPlan(ModelMap modelMap, @RequestParam Integer screenId) {
		Screen screen = screenService.get(screenId);
		Hall hall = hallService.getSeatInfo(screen.getHall().getHallId());
		modelMap.addAttribute("hall", hall);
		return "/common/seatPlan";
	}
}
