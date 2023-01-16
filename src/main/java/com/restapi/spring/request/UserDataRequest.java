package com.restapi.spring.request;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserDataRequest {
	private String emailId;
	private String password;

}