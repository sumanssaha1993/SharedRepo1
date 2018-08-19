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
public class RegistrationDAO {
	@Autowired
	private SessionFactory factory;

	public boolean save(UserDTO dto) {
		boolean flag = false;
		Session sess = factory.openSession();
		Transaction tx = sess.beginTransaction();
		try {
			tx.begin();
			Query query = sess.createQuery("from UserDTO where email=:email");
			query.setParameter("email", dto.getEmail());
			if (query.list().size() < 1) {
				sess.save(dto);
				tx.commit();
				flag = true;
			}
		} catch (HibernateException e) {
			flag = false;
			tx.rollback();
			e.printStackTrace();
		} finally {
			sess.close();
		}
		return flag;
	}

}
