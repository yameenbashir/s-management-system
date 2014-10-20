package com.sms.service;

import org.springframework.stereotype.Service;

import com.sms.beans.Login;
@Service("loginService")
public class LoginServiceImpl implements LoginService{
	
	public boolean validateUser(Login user){
		
		if(user.getUserName().equalsIgnoreCase(user.getPassword())){
			return true;
		}
		
		
		return false;
		
	}

}
