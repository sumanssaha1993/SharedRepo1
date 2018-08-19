package com.jspiders.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.jspiders.dto.FoodItemDTO;
import com.jspiders.model.service.FoodService;

@RestController
@RequestMapping("/AddFood")
public class AddFoodControllerREST {

	private Map<String, ArrayList<Object>> foodlist = new HashMap<String, ArrayList<Object>>();

	@Autowired
	private FoodService service;

	@RequestMapping(value = "/Add/{food}", method = RequestMethod.POST)
	@ResponseBody
	public void addMusteredHissha(@PathVariable("food") String food, HttpServletRequest req) {

		String FoodName = food;
		ArrayList<Object> flist = new ArrayList<Object>();
		FoodItemDTO fooditemdto = service.askFood(FoodName);
		if (!foodlist.containsKey(fooditemdto.getFood_name())) {
			int qty = Integer.parseInt(req.getParameter("qty"));
			fooditemdto.setFood_price(fooditemdto.getFood_price() * qty);
			flist.add(fooditemdto.getFood_name());
			flist.add(fooditemdto.getFood_type());
			flist.add(fooditemdto.getFood_price());
			flist.add(qty);
			foodlist.put(fooditemdto.getFood_name(), flist);
		} else {
			int qty = Integer.parseInt(req.getParameter("qty"));
			int newQty = (int) foodlist.get(fooditemdto.getFood_name()).get(3) + qty;
			foodlist.get(fooditemdto.getFood_name()).set(3, newQty);
			foodlist.get(fooditemdto.getFood_name()).set(2, fooditemdto.getFood_price() * newQty);
		}

		HttpSession session1 = req.getSession(false);
		if (session1.getAttribute("name") != null) {
			session1.setAttribute("food", foodlist);
		}
	}


}
