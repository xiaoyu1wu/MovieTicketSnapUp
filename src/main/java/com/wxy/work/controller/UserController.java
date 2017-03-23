package com.wxy.work.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.wxy.work.entity.User;
import com.wxy.work.entity.User;
import com.wxy.work.enums.ErrorMsg;
import com.wxy.work.service.UserService;
import com.wxy.work.util.Encrypter;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * 创建时间：2015-2-7 上午11:49:00
 * 
 * @author andy
 * @version 2.2 描述： 用户Controller
 */
@Controller
@RequestMapping("/user")
public class UserController {

	private static final Logger LOGGER = Logger.getLogger(UserController.class);

	@Autowired
	private UserService userService;

	@RequestMapping("/showInfo/{userId}")
	public String showUserInfo(ModelMap modelMap, @PathVariable Integer userId) {
		LOGGER.info("查询用户：" + userId);
		User userInfo = userService.load(userId);
		modelMap.addAttribute("userInfo", userInfo);
		return "/user/showInfo";
	}

	@RequestMapping("/showInfos")
	public @ResponseBody List<User> showUserInfos() {
		LOGGER.info("查询用户全部用户");
		List<User> userInfos = userService.findAll();
		return userInfos;
	}

	@RequestMapping("/main")
	public String main(ModelMap modelMap) {
		LOGGER.debug("进入main.jsp");
		return "/common/main";
	}

	@RequestMapping("/movieDetail")
	public String testMovieDetail(ModelMap modelMap) {
		LOGGER.debug("进入movieDetail.jsp");
		return "/common/movieDetail";
	}

	@RequestMapping(value = "/regedit")
	public String regedit() {
		return "/user/userRegedit";
	}

	@RequestMapping(value = "/processUserRegedit")
	public ModelAndView processRegedit(HttpServletRequest request, HttpSession session) {
		ModelAndView model = new ModelAndView();

		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String confirmPassword = request.getParameter("confirmPassword");
		String yzm = request.getParameter("yzm");

		String verifyCode = (String) session.getAttribute("verifyCode");
		if (!verifyCode.equalsIgnoreCase(yzm)) {
			model.addObject("error", ErrorMsg.NotCorrectVerifyCode.getValue());
			model.setViewName("/user/userRegedit");
		} else if (!password.equals(confirmPassword)) {
			model.addObject("error", ErrorMsg.NotMatchPassword.getValue());
			model.setViewName("/user/userRegedit");
		} else {
			int userId = userService.findUser(email);
			// 若是新用户
			if (userId == -1) {

				User user = new User();
				user.setUserEmail(email);
				String md5Pwd = Encrypter.encrypt(password);// MD5加密处理
				user.setUserPassword(md5Pwd);

				userService.save(user);
				userId = userService.findUser(email);
				session.setAttribute("userId", userId);

				model.addObject("userEmail", email);
				model.setViewName("/common/main");
			} else {
				model.addObject("error", ErrorMsg.AleadyExistUser);
				model.setViewName("/user/Regedit");
			}
		}

		return model;
	}

	@RequestMapping(value = "login")
	public String login() {
		return "/user/userLogin";
	}

	@RequestMapping(value = "/processUserLogin")
	public ModelAndView processLogin(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
		ModelAndView model = new ModelAndView();

		String verifyCode = (String) session.getAttribute("verifyCode");
		String email = request.getParameter("email");
		String pwd = request.getParameter("password");
		String yzm = (String) request.getParameter("yzm");
		if (!verifyCode.equalsIgnoreCase(yzm)) {
			model.addObject("error", ErrorMsg.NotCorrectVerifyCode.getValue());
			model.setViewName("/user/userLogin"); 
		} else {
			String md5Pwd = Encrypter.encrypt(pwd);
			int userId = userService.findUser(email, md5Pwd);
			// 若用户存在
			if (userId != -1) {
				session.setAttribute("userId", userId); 
				
				model.addObject("userEmail", email);
				model.setViewName("/common/main");
			} else {
				model.addObject("error", ErrorMsg.NotExistUser.getValue());
				model.setViewName("/user/userLogin");
			}
		}
		return model;
	}

}
