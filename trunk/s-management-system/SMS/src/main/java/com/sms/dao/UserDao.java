package com.sms.dao;

import com.sms.beans.User;

public interface UserDao {
	
	User findUser(String username, String password);
	void insertUser(String username, String password);

}
