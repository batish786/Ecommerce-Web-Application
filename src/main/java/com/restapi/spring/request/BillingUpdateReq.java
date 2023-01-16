package com.restapi.spring.request;

import lombok.Data;

@Data
public class BillingUpdateReq {
	 private  String adress;
	 private String city;
	 private String state;
	 private String zipcode;
	 private String country;
	 private long id;
}
