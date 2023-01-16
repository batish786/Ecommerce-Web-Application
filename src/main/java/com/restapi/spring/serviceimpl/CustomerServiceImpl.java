package com.restapi.spring.serviceimpl;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.restapi.spring.entity.Customer;
import com.restapi.spring.entity.User;
import com.restapi.spring.helper.CustomerHelper;
import com.restapi.spring.helper.UserHelper;
import com.restapi.spring.repository.CustomersRepo;
import com.restapi.spring.repository.UsersRepo;
import com.restapi.spring.request.CustomerSaveReq;
import com.restapi.spring.request.CustomerUpdateReq;
import com.restapi.spring.response.CustomerDataResponse;
import com.restapi.spring.service.CustomerService;


@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	private CustomersRepo customerrepo;
	
	@Autowired
	private UsersRepo usersRepo;
	@Override
	@Transactional
	public void saveCustomerData(CustomerSaveReq request) {
		Customer customer=CustomerHelper.customerEntityConverter(request);
	     Optional<User>  user = usersRepo.findById(request.getUserId());
	     customer.setUser(user.get());
		customerrepo.save(customer);		
	}

	@Override
	public List<CustomerDataResponse> customerByUserId(long userId) throws Exception {
		Optional<List<Customer>> customer = null;
		try {
			customer = customerrepo.findByUserId(userId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return customer.isPresent() == true ? CustomerHelper.CustomerDataConvervter(customer.get()) : null;
	}

	@Override
	public void updateCustomerData(CustomerUpdateReq req) {
		Customer customer=CustomerHelper.customerUpdateConverter(req);
	     Optional<User>  user = usersRepo.findById(req.getUserId());
	     customer.setUser(user.get());
		customerrepo.save(customer);
	}


	

	

}
