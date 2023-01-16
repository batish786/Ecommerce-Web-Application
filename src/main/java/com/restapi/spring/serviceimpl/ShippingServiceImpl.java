package com.restapi.spring.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restapi.spring.entity.Customer;
import com.restapi.spring.entity.ShippingAddress;
import com.restapi.spring.entity.User;
import com.restapi.spring.helper.CustomerHelper;
import com.restapi.spring.helper.ShippingAddressHelper;
import com.restapi.spring.repository.ShippingsAddressRepo;
import com.restapi.spring.request.CustomerUpdateReq;
import com.restapi.spring.request.ShippingAdressDataReq;
import com.restapi.spring.request.ShippingUpdateReq;
import com.restapi.spring.response.CustomerDataResponse;
import com.restapi.spring.response.ShippingResponse;
import com.restapi.spring.service.ShippingService;

@Service
public class ShippingServiceImpl implements ShippingService{

	@Autowired
	private ShippingsAddressRepo Shippingrepo;
	
	@Override
	public void saveShippingData(ShippingAdressDataReq req) {
		ShippingAddress address = ShippingAddressHelper.shippingAddressEntityConverter(req);
		Shippingrepo.save(address);
	}

	

	@Override
	public List<ShippingResponse> findById(long id) throws Exception {
		Optional<List<ShippingAddress>> shipping = null;
		try {
			shipping = Shippingrepo.findById(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return shipping.isPresent() == true ? ShippingAddressHelper.shippingDataConverter(shipping.get()) :  null;
	}
	
	

	@Override
	public void ShippingUpdateReq(ShippingUpdateReq request) {
		ShippingAddress shippingAddress = ShippingAddressHelper.ShippingAddressUpdateConverter(request);
	Shippingrepo.save(shippingAddress);
	}
	
	
}




