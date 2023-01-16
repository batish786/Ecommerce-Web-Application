package com.restapi.spring.request;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ShippingAdressDataReq {

	private String address;
	private String city;
	private String state;
	private String zipcode;
	private String country;

}