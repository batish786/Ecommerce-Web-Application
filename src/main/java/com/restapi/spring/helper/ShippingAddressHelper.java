package com.restapi.spring.helper;

import java.util.ArrayList;
import java.util.List;

import com.restapi.spring.entity.Customer;
import com.restapi.spring.entity.ShippingAddress;
import com.restapi.spring.request.CustomerUpdateReq;
import com.restapi.spring.request.ShippingAdressDataReq;
import com.restapi.spring.request.ShippingUpdateReq;
import com.restapi.spring.response.CustomerDataResponse;
import com.restapi.spring.response.ShippingResponse;

public class ShippingAddressHelper {

	private static final Customer address = null;


	public static ShippingAddress shippingAddressEntityConverter(ShippingAdressDataReq request) {
       ShippingAddress address = new ShippingAddress();
       address.setAddress(request.getAddress());
       address.setCity(request.getCity());
       address.setState(request.getState());
       address.setZipcopde(request.getZipcode());
       address.setCountry(request.getCountry());
		return address;
	}
	
	public static ShippingAddress ShippingAddressUpdateConverter(ShippingUpdateReq request) {
		 ShippingAddress address = new ShippingAddress();
		 address.setId(request.getId());
		 address.setAddress(request.getAddress());
		 address.setCity(request.getAddress());
		 address.setState(request.getState());
		 address.setZipcopde(request.getZipcode());
		 address.setCountry(request.getCountry());
		return address;
	}
	

	public static List<ShippingResponse> shippingDataConverter(List<ShippingAddress> address) {
		List<ShippingResponse> list = new ArrayList<>();
		for(ShippingAddress request : address) {
			ShippingResponse shippingResponse = new ShippingResponse();
			shippingResponse.setAddress(request.getAddress());
			shippingResponse.setCity(request.getCity());
			shippingResponse.setState(request.getState());
			shippingResponse.setZipcode(request.getZipcopde());
			shippingResponse.setCountry(request.getCountry());
			list.add(shippingResponse);
		}
		return list;
	}


}

