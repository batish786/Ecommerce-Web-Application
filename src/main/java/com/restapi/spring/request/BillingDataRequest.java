package com.restapi.spring.request;

import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor
public class BillingDataRequest {
	
	 private  String adress;
	 private String city;
	 private String state;
	 private String zipcode;
	 private String country;
	 private long id;
}
