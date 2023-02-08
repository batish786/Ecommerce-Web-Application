package com.restapi.spring.controller;


import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.NonNullApi;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.restapi.spring.entity.Customer;
import com.restapi.spring.request.CustomerSaveReq;
import com.restapi.spring.request.CustomerUpdateReq;
import com.restapi.spring.response.UserDataResponse;
import com.restapi.spring.service.CustomerService;


@RestController
@RequestMapping("/admin/customer")

public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@PostMapping("/save")
	public ResponseEntity<?>  saveCustomer(@RequestBody CustomerSaveReq request){
		try {
			customerService.saveCustomerData(request);
			return new ResponseEntity<>("Data is Inserted", HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>("UserId is not Present" , HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	@GetMapping("/user")
	public ResponseEntity<Customer> getUserId(@RequestParam long id) throws Exception{
	Customer customer= customerService.getCustomer(id);
	return new ResponseEntity<>(customer, HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity<?> updateCustomer(@RequestBody CustomerUpdateReq req){
	customerService.updateCustomerData(req);
		return ResponseEntity.ok(Boolean.TRUE);
	}
	
//	@PutMapping("/user/allupdate")
//	public List<Customer> customers(@RequestBody CustomerUpdateReq req){
//	return	customerService.updateCustomer(req);
//	}
}

