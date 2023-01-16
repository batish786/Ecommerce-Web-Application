package com.restapi.spring.request;

import lombok.Data;

@Data
public class ShippingUpdateReq {

	private Long id;
	private String address;
	private String city;
	private String state;
	private String zipcode;
	private String country;
}
