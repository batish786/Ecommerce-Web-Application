package com.restapi.spring.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.spring.request.UserDataRequest;
import com.restapi.spring.response.UserDataResponse;
import com.restapi.spring.service.UserService;



@RestController

public class UserController {

	@Autowired
	private UserService service;
	
	@GetMapping("/getUser")
	public UserDataResponse getUser(@RequestParam String emailId) throws Exception {
		return service.getUserByemailId(emailId);
	}
	@PostMapping("/signUp")
	public UserDataResponse singUp(@RequestBody UserDataRequest request) throws Exception {
		return service.saveUserDataRequest(request);
	}
	
}
