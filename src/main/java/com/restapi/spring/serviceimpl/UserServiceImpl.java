package com.restapi.spring.serviceimpl;


import static com.restapi.spring.constant.ErrorMessage.USER_ALREADY_PRESENT_EXCEPTION;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.restapi.spring.entity.User;
import com.restapi.spring.helper.UserHelper;
import com.restapi.spring.repository.UsersRepo;
import com.restapi.spring.request.UserDataRequest;
import com.restapi.spring.response.UserDataResponse;
import com.restapi.spring.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UsersRepo userRepo;
	

	@Override
	public UserDataResponse saveUserDataRequest(UserDataRequest request) throws Exception {
		   boolean isPresent = userDedupe(request.getEmailId());
	       if (!isPresent) {
	           User user = userRepo.save(UserHelper.UserEntityConverter(request));
	           return UserHelper.UserResponseConverter(user);
	       } else {
	           throw new Exception(USER_ALREADY_PRESENT_EXCEPTION);
	       }
	}

	private boolean userDedupe(String emailId) {
	      boolean isPresent = Boolean.FALSE;
	        Optional<User> user = userRepo.findByEmailId(emailId);
	        if(user.isPresent()) {
	            isPresent = Boolean.TRUE;
	        }
	        return isPresent;
	    }

	
	@Override
	public UserDataResponse getUserByemailId(String emailId) throws Exception {
		Optional<User> user = null;
		try {
			user = userRepo.findByEmailId(emailId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return user.isPresent() == true ? UserHelper.UserResponseConverter(user.get()) : null;
		
	}
}