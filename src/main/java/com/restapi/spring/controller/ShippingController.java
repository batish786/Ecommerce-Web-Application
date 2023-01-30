package com.restapi.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.spring.request.CustomerUpdateReq;
import com.restapi.spring.request.ShippingAdressDataReq;
import com.restapi.spring.request.ShippingUpdateReq;
import com.restapi.spring.response.ShippingResponse;
import com.restapi.spring.service.ShippingService;



@RestController
@RequestMapping("/shipping")
public class ShippingController {

	@Autowired
	private ShippingService shippingService;
	
	@GetMapping("/get")
	public List<ShippingResponse> getId(@RequestParam long id) throws Exception{
	return	shippingService.findById(id);
	}
	
	@PutMapping("/updateShipping")
	public ResponseEntity<?> updateShippingAddress(@RequestBody ShippingUpdateReq req ){
	shippingService.ShippingUpdateReq(req);
	return ResponseEntity.ok(Boolean.TRUE);
	}

	
}
