package com.restapi.spring.helper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.util.CompactStringObjectMap;
import com.restapi.spring.entity.Customer;
import com.restapi.spring.entity.User;
import com.restapi.spring.request.CustomerSaveReq;
import com.restapi.spring.request.CustomerUpdateReq;
import com.restapi.spring.response.CustomerDataResponse;
import com.restapi.spring.response.UserDataResponse;


@Service
public class CustomerHelper {

	public static Customer customerEntityConverter(CustomerSaveReq request) {
		Customer customer = new Customer();
		customer.setBillingAddress(request.getBillingAddress());
		customer.setFirstname(request.getFirstName());
		customer.setLastname(request.getLastName());
		customer.setCustomerPhone(request.getCustomerPhone());
		customer.setShippingAddress(request.getShippingAddress());
		return customer;
		
		
	}
	

	public static Customer customerUpdateConverter(CustomerUpdateReq request) {
		Customer customer = new Customer();
		customer.setId(request.getId());
		customer.setBillingAddress(request.getBillingAddress());
		customer.setFirstname(request.getFirstName());
		customer.setLastname(request.getLastName());
		customer.setCustomerPhone(request.getCustomerPhone());
		customer.setShippingAddress(request.getShippingAddress());
		return customer;
	}
	
	public static List<CustomerDataResponse>CustomerDataConvervter(List<Customer> customer) {
		List<CustomerDataResponse> list = new ArrayList<>();
		for(Customer response : customer) {
		CustomerDataResponse dataResponse = new CustomerDataResponse();
		dataResponse.setId(response.getId());
		dataResponse.setFirstName(response.getFirstname());
		dataResponse.setLastName(response.getLastname());
		dataResponse.setCustomerPhone(response.getCustomerPhone());
//		dataResponse.setShippingAddressId(response.getShippingAddress());
//		dataResponse.setBillingAddressId(response.getBillingAdressid());
		list.add(dataResponse);
		}
		return list;
	
		
	}
	
}

