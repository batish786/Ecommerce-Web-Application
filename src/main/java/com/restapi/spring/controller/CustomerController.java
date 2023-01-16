package com.restapi.spring.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.spring.entity.Customer;
import com.restapi.spring.helper.CustomerHelper;
import com.restapi.spring.repository.CustomersRepo;
import com.restapi.spring.request.CustomerSaveReq;
import com.restapi.spring.request.CustomerUpdateReq;
import com.restapi.spring.response.CustomerDataResponse;
import com.restapi.spring.service.CustomerService;


@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@PostMapping("/save")
	public void saveCustomer(@RequestBody CustomerSaveReq request){
		customerService.saveCustomerData(request);
	}
	@GetMapping("/userId")
	public List<CustomerDataResponse> getUserId(@RequestParam long userId) throws Exception{
	return customerService.customerByUserId(userId);
	}
	
	@PutMapping("/update")
	public ResponseEntity<?> updateCustomer(@RequestBody CustomerUpdateReq req){
	customerService.updateCustomerData(req);
		return ResponseEntity.ok(Boolean.TRUE);
	}
}

