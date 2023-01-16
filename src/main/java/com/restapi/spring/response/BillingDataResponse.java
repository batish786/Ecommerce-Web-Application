package com.restapi.spring.response;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@JsonSerialize
public class BillingDataResponse {

	private long id;
	private String address;
	private String city;
	private String state;
	private String zipcode;
	private String Country;
	
}
