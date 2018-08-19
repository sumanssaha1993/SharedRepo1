package com.jspiders.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.google.gson.Gson;
import com.jspiders.model.service.FoodService;
import com.jspiders.dto.Country;
import com.jspiders.dto.FoodItemDTO;
import com.jspiders.model.dao.CountryDao;

@Controller
@RequestMapping("/")
public class SearchFoodController {
	@Autowired
	private CountryDao CountryDao;

	@RequestMapping(value = "search.htm", method = RequestMethod.GET)
	public void searchFood(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String q = request.getParameter("query");
		ArrayList<FoodItemDTO> o = CountryDao.getCountryName(q);
		Gson gson = new Gson();

		// convert java object to JSON format,
		// and returned as JSON formatted string
		String json = gson.toJson(o);
		// System.out.println(json);
		response.getWriter().write("{\"suggestions\":" + json + "}");
	}
}
