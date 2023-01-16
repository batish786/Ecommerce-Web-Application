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

import com.restapi.spring.entity.BillingAddress;
import com.restapi.spring.request.BillingDataRequest;
import com.restapi.spring.request.BillingUpdateReq;
import com.restapi.spring.request.CustomerUpdateReq;
import com.restapi.spring.service.BillingService;


@RestController
@RequestMapping("/billing")
public class BillingController {

	@Autowired
	private BillingService billingService;

	@PostMapping("/save")
	public void saveBilling(@RequestBody BillingDataRequest request) {
		billingService.saveBillingData(request);
	}
	@PutMapping("/update")
	public ResponseEntity<?> updateBillingAddress(@RequestBody BillingUpdateReq req){
		billingService.updateBillingData(req);
		return ResponseEntity.ok(Boolean.TRUE);
	}
	
	@GetMapping("/data/id")
	public List<BillingAddress> getId(@RequestParam long id) throws Exception{ 
		return billingService.getId(id);
	}

}