package com.jspiders.model.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jspiders.dto.FoodItemDTO;
import com.jspiders.dto.UserDTO;
import com.jspiders.model.dao.FoodCartDAO;
import com.jspiders.model.dao.LoginDAO;

@Service
public class FoodService {
	@Autowired
	private FoodCartDAO dao;

	public FoodItemDTO askFood(String foodname) {
		FoodItemDTO dto = dao.getFood(foodname);
		return dto;
	}
}
