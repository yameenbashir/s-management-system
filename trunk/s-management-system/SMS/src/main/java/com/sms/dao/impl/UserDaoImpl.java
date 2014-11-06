package com.sms.dao.impl;

import org.hibernate.Session;

import com.sms.beans.User;
import com.sms.dao.UserDao;
import com.sms.util.HibernateUtil;

public class UserDaoImpl implements UserDao {
	
	@Override
	public User findUser(String username, String password) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		User user = (User)session.get(User.class, new User(username, password));
		session.clear();
		session.close();
		return user;
	}

	@Override
	public void insertUser(String username, String password) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.save(new User(username, password));
		session.getTransaction().commit();
		session.clear();
		session.close();
	}

}
