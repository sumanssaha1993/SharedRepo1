package com.jspiders.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jspiders.dto.UserDTO;
import com.jspiders.model.service.LoginService;

@Controller
@RequestMapping("/")
public class LoginController {
	@Autowired
	private LoginService service;

	@RequestMapping(value = "login.htm", method = RequestMethod.POST)
	public String login(HttpServletRequest req) {
		String page = null;
		String username = req.getParameter("email");
		String password = req.getParameter("pass");
		String b1 = service.isUser(username, password);
		if (b1 != null) {
			HttpSession session1 = req.getSession(true);
			session1.setAttribute("name", b1);
			page = "welcome.html";
		} else {
			page = "login.html";
		}
		return page;
	}
}
