package com.restapi.spring.service;

import java.util.List;

import com.restapi.spring.request.CustomerUpdateReq;
import com.restapi.spring.request.ShippingAdressDataReq;
import com.restapi.spring.request.ShippingUpdateReq;
import com.restapi.spring.response.ShippingResponse;

public interface ShippingService {

	void saveShippingData(ShippingAdressDataReq req);
	List<ShippingResponse> findById(long id) throws Exception;
	void ShippingUpdateReq(ShippingUpdateReq req);
}