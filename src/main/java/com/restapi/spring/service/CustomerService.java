package com.restapi.spring.service;

import java.util.List;

import com.restapi.spring.entity.Customer;
import com.restapi.spring.request.CustomerSaveReq;
import com.restapi.spring.request.CustomerUpdateReq;
import com.restapi.spring.response.CustomerDataResponse;

public interface CustomerService {
	void saveCustomerData(CustomerSaveReq req);
	
	Customer getCustomer(Long id);

	List<CustomerDataResponse> customerByUserId(long userId) throws Exception;
	void updateCustomerData(CustomerUpdateReq req);
}
