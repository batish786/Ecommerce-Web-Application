package com.restapi.spring.request;


import com.restapi.spring.entity.BillingAddress;
import com.restapi.spring.entity.ShippingAddress;

import lombok.Data;
@Data
public class CustomerSaveReq {

	private  String firstName;
	private String lastName;
	private String customerPhone;
	private BillingAddress billingAddress;
	private  ShippingAddress shippingAddress;
	private Long userId;



}
