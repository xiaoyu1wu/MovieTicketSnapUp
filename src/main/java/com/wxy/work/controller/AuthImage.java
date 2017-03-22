package com.wxy.work.controller;

import java.io.IOException;  

import javax.servlet.ServletException;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wxy.work.util.VerifyCodeUtils;

/**
 * <p><b>AuthImage Description:</b> (验证码)</p>
 * <b>DATE:</b> 2016年6月2日 下午3:53:12
 */
@Controller
@RequestMapping("/authImage")
public class AuthImage {  
    static final long serialVersionUID = 1L;  
  
    @RequestMapping("/image")
    public void authImage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {  
        response.setHeader("Pragma", "No-cache");  
        response.setHeader("Cache-Control", "no-cache");  
        response.setDateHeader("Expires", 0);  
        response.setContentType("image/jpeg");  
          
        //生成随机字串  
        String verifyCode = VerifyCodeUtils.generateVerifyCode(4);  
        //存入会话session  
        HttpSession session = request.getSession(true);  
        //删除以前的
        session.removeAttribute("verifyCode");
        session.setAttribute("verifyCode", verifyCode.toLowerCase());  
        //生成图片  
        int w = 100, h = 30;  
        VerifyCodeUtils.outputImage(w, h, response.getOutputStream(), verifyCode);  
        response.getOutputStream().flush();
    }  
} 