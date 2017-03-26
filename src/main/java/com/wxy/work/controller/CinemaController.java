package com.wxy.work.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cinema")
public class CinemaController {
	@RequestMapping(value = "/showSeatPlan")
	public String showSeatPlan() {
		return "/common/seatPlan";
	}
}
