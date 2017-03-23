package com.wxy.work.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class LoginInterceptor extends HandlerInterceptorAdapter{

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		HttpSession session = request.getSession();
		Integer userId = (Integer) session.getAttribute("userId");
		Integer adminId = (Integer) session.getAttribute("adminId");
		
		if (request.getHeader("x-requested-with") != null && request.getHeader("x-requested-with").equalsIgnoreCase("XMLHttpRequest")){ //如果是ajax请求响应头会有x-requested-with  
            return true;
        }else if(userId==null && adminId == null){
			response.sendRedirect("/MovieTicketSnapUp/user/main.htmls");
			return false;
		}
		return super.preHandle(request, response, handler);
	}
}
