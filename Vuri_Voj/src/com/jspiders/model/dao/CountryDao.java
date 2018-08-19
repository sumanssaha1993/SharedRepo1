package com.jspiders.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.object.SqlQuery;
import org.springframework.stereotype.Repository;

import com.jspiders.dto.Country;
import com.jspiders.dto.FoodItemDTO;

@Repository
public class CountryDao {

	@Autowired
	private SessionFactory factory;

	public ArrayList<FoodItemDTO> getCountryName(String id) {

		ArrayList<FoodItemDTO> data = new ArrayList<FoodItemDTO>();
		Session sess = factory.openSession();
		Transaction tx = sess.beginTransaction();
		try {
			tx.begin();
			SQLQuery query = sess
					.createSQLQuery("select food_name from food_item_hdr where food_name like '%" + id + "%'");
			// query.setString(0, "%"+id+"%");
			data = (ArrayList<FoodItemDTO>) query.list();
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		} finally {
			sess.close();
		}
		return data;
	}

}
