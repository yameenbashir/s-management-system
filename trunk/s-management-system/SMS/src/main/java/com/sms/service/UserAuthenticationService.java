package com.sms.service;

public interface UserAuthenticationService {
	
	boolean isAuthenticated(String username, String password);

}
