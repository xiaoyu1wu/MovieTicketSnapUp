package com.wxy.work.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.wxy.work.entity.Admin;
import com.wxy.work.entity.Screen;
import com.wxy.work.entity.User;
import com.wxy.work.enums.ErrorMsg;
import com.wxy.work.service.AdminService;
import com.wxy.work.service.UserService;
import com.wxy.work.util.Encrypter;

@Controller
@RequestMapping(value = "/admin")
public class AdminController {
	
	@Autowired
	private AdminService adminService;
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "login")
	public String login() {
		return "/admin/adminLogin";
	}
	
	@RequestMapping(value = "/processAdminLogin")
	public ModelAndView processLogin(HttpServletRequest request, HttpServletResponse response, HttpSession session, @ModelAttribute Admin admin) {
		ModelAndView model = new ModelAndView();

		admin.setAdminPassword(Encrypter.encrypt(admin.getAdminPassword()));
		Admin existAdmin = adminService.validate(admin);
		// 若用户存在
		if (existAdmin != null) {
			session.setAttribute("adminName", existAdmin.getAdminName()); 
			response.addCookie(new Cookie("AdminName", existAdmin.getAdminName()));
			model.setViewName("/admin/index");
		} else {
			model.addObject("error", ErrorMsg.NotExistUser.getValue());
			model.setViewName("/admin/adminLogin");
		}
		return model;
	}
	
	@RequestMapping(value = "/getUserList", method=RequestMethod.GET)
	private @ResponseBody List<User> getScreenList(ModelMap modelMap) throws ParseException {
		List<User> users = userService.findAll();
		return users;
	}
	
	@RequestMapping(value = "/index", method=RequestMethod.GET)
	private String index(){
		return "/admin/index";
	}
	
	@RequestMapping(value = "/addUser", method=RequestMethod.GET)
	private String addUser(){
		return "/admin/addUser";
	}
	
}
