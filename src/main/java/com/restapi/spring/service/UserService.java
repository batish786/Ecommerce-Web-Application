package com.restapi.spring.service;

import com.restapi.spring.request.UserDataRequest;
import com.restapi.spring.response.UserDataResponse;

public interface UserService {

	UserDataResponse getUserByemailId(String emailid) throws Exception;
	UserDataResponse saveUserDataRequest(UserDataRequest emailid) throws Exception;
}
