package com.jspiders.model.dao;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jspiders.dto.UserDTO;

@Repository
public class LoginDAO {
	@Autowired
	private SessionFactory factory;

	public UserDTO getUser(String username, String password) {
		UserDTO dto = null;
		Session sess = factory.openSession();
		Transaction tx = sess.beginTransaction();
		try {
			tx.begin();
			Query query = sess.createQuery("from UserDTO where email=:email");
			query.setParameter("email", username);
			dto = (UserDTO) query.uniqueResult();
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
