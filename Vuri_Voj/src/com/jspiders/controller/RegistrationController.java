package com.jspiders.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jspiders.dto.UserDTO;
import com.jspiders.model.service.RegistrationService;

@Controller
@RequestMapping("/")
public class RegistrationController {
	@Autowired
	private RegistrationService service;

	@RequestMapping(value = "register.htm", method = RequestMethod.POST)
	public String register(@ModelAttribute UserDTO dto, HttpServletRequest request) {
		String page = null;
		boolean b1 = service.isSave(dto);
		if (b1)
			page = "welcome.html";
		else
			page = "index.jsp";
		request.setAttribute("flagval", "showmsg");
		System.out.println("This Email Id is already registered");
		return page;
	}
}
