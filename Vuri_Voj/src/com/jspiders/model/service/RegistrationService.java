package com.jspiders.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jspiders.dto.UserDTO;
import com.jspiders.model.dao.RegistrationDAO;

@Service
public class RegistrationService {
	@Autowired
	private RegistrationDAO dao;

	public boolean isSave(UserDTO dto) {
		return dao.save(dto);
	}

}
