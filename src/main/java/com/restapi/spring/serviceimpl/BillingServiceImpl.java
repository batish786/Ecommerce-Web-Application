package com.restapi.spring.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restapi.spring.entity.BillingAddress;
import com.restapi.spring.entity.Customer;
import com.restapi.spring.entity.User;
import com.restapi.spring.helper.BillingHelper;
import com.restapi.spring.helper.CustomerHelper;
import com.restapi.spring.repository.BillingRepos;
import com.restapi.spring.request.BillingDataRequest;
import com.restapi.spring.request.BillingUpdateReq;
import com.restapi.spring.service.BillingService;



@Service
public class BillingServiceImpl implements BillingService{

	@Autowired
	private BillingRepos BillingRepos;
	@Override
	public void saveBillingData(BillingDataRequest request) {
		BillingAddress address = BillingHelper.billingAddressEntityConverter(request);
		BillingRepos.save(address);
	}


	@Override
	public List<BillingAddress> getId(long id) throws Exception {
		return BillingRepos.findById(id);
	}


	@Override
	public void updateBillingData(BillingUpdateReq request) {
		BillingAddress billingAddress = BillingHelper.BillingUpdateConverter(request);
		BillingRepos.save(billingAddress);
	}


	


	
	
	

}

