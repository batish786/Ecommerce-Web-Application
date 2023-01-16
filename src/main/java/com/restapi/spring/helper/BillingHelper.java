package com.restapi.spring.helper;

import com.restapi.spring.entity.BillingAddress;
import com.restapi.spring.entity.Customer;
import com.restapi.spring.request.BillingDataRequest;
import com.restapi.spring.request.BillingUpdateReq;
import com.restapi.spring.request.CustomerUpdateReq;

public class BillingHelper {

	public static BillingAddress billingAddressEntityConverter(BillingDataRequest request) {
		BillingAddress address = new BillingAddress();
		address.setAddress(request.getAdress());
		address.setCity(request.getCity());
		address.setCountry(request.getCountry());
		address.setState(request.getState());
		address.setZipcode(request.getZipcode());
		
		return address;	
	}
	public static BillingAddress BillingUpdateConverter(BillingUpdateReq request) {
		BillingAddress address = new BillingAddress();;
		address.setId(request.getId());
		address.setAddress(request.getAdress());
		address.setCity(request.getCity());
		address.setCountry(request.getCountry());
		address.setState(request.getState());
		address.setZipcode(request.getZipcode());
		return address;
		
		
	}
}