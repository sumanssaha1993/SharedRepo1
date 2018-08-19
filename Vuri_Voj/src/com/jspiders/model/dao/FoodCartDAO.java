package com.jspiders.model.dao;

import java.util.ArrayList;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jspiders.dto.FoodItemDTO;
import com.jspiders.dto.UserDTO;

@Repository
public class FoodCartDAO {
	@Autowired
	private SessionFactory factory;

	public FoodItemDTO getFood(String foodname) {
		FoodItemDTO dto = null;
		Session sess = factory.openSession();
		Transaction tx = sess.beginTransaction();
		try {
			tx.begin();
			Query query = sess.createQuery("from FoodItemDTO where food_name=:food_name");
			query.setParameter("food_name", foodname);
			dto = (FoodItemDTO) query.uniqueResult();
			tx.commit();
		} catch (HibernateException e) {
			tx.rollback();
			e.printStackTrace();
		} finally {
			sess.close();
		}
		return dto;
	}
}
