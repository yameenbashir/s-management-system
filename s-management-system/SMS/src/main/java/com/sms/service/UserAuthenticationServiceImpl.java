package com.sms.service;

import com.sms.beans.User;
import com.sms.dao.UserDao;
import com.sms.dao.impl.UserDaoImpl;

public class UserAuthenticationServiceImpl implements UserAuthenticationService {

	@Override
	public boolean isAuthenticated(String username, String password) {
		UserDao userDao = new UserDaoImpl();
		User user = userDao.findUser(username, password);
		return (user == null ? false : true);
	}

}
