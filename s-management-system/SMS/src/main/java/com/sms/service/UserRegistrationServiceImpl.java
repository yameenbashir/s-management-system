package com.sms.service;

import com.sms.dao.UserDao;
import com.sms.dao.impl.UserDaoImpl;

public class UserRegistrationServiceImpl implements UserRegistrationService {

	@Override
	public void addUser(String username, String password) {
		UserDao userDao = new UserDaoImpl();
		userDao.insertUser(username, password);
	}

}
