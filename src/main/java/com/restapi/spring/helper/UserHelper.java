package com.restapi.spring.helper;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.restapi.spring.entity.User;
import com.restapi.spring.request.UserDataRequest;
import com.restapi.spring.response.UserDataResponse;

public class UserHelper {

	private final static BCryptPasswordEncoder bCryptPasswordEncoder  = new BCryptPasswordEncoder();
	
	public static UserDataResponse 	UserResponseConverter(User user) {
		UserDataResponse dataResponse = new UserDataResponse();
		dataResponse.setId(user.getId());
		dataResponse.setEmailId(user.getEmailId());
		dataResponse.setEnabled(Boolean.TRUE);
		dataResponse.setPassword(user.getPassword());
		return dataResponse;
		
	}
	
	public static User UserEntityConverter(UserDataRequest request) {
		User user = new User();
		user.setEmailId(request.getEmailId());
		user.setEnabled(Boolean.TRUE);
		user.setPassword(bCryptPasswordEncoder.encode(request.getPassword()));
		return user;
		
	}


}
