package com.zhu.controller;

import java.io.IOException;
import java.util.Date;
import java.util.UUID;

import com.zhu.util.CookieUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class FirstController {


	@RequestMapping("/login")
	public String doLogin() {
		return "login";
	}

	@RequestMapping("/getToken")
	public void getToken(String username , String password , HttpServletRequest request , HttpServletResponse response) throws IOException {
		System.out.println(username + password);
		String token = UUID.randomUUID().toString();
		CookieUtils.setCookie(request,response,"token" ,token);
		response.sendRedirect("success");
	}


}
