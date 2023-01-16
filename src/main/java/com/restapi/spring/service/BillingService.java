package com.restapi.spring.service;

import java.util.List;
import com.restapi.spring.entity.BillingAddress;
import com.restapi.spring.request.BillingDataRequest;
import com.restapi.spring.request.BillingUpdateReq;


public interface BillingService {

	void saveBillingData(BillingDataRequest request);
	void updateBillingData(BillingUpdateReq req);
	public List<BillingAddress> getId(long id) throws Exception;
}
