package com.restapi.spring.response;

import java.util.List;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.restapi.spring.entity.Cart;
import com.restapi.spring.entity.SalesOrder;
import com.restapi.spring.entity.ShippingAddress;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@JsonSerialize
public class CustomerDataResponse {

	
	private long id;
	private String firstName;
	private String lastName;
	private String customerPhone;
	private String shippingAddressId;
	private String billingAddressId;
	private long userId;
	private long cartId;
}