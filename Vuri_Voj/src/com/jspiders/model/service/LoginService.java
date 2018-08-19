package com.jspiders.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jspiders.dto.UserDTO;
import com.jspiders.model.dao.LoginDAO;

@Service
public class LoginService {
	@Autowired
	private LoginDAO dao;

	public String isUser(String username, String password) {
		UserDTO dto = dao.getUser(username, password);
		if ((dto != null) && (dto.getEmail().equals(username) && dto.getPassword().equals(password))) {
			return dto.getName().toString();
		} else {
			return null;
		}
	}

}
