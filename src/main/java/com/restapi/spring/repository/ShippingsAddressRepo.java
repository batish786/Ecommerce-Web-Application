package com.restapi.spring.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.restapi.spring.entity.ShippingAddress;
import com.restapi.spring.request.ShippingAdressDataReq;

@Repository
public interface ShippingsAddressRepo extends JpaRepository<ShippingAddress, Integer>{

	Optional<List<ShippingAddress>> findByAddress(String address);

	boolean save(ShippingAdressDataReq req);

	Optional<List<ShippingAddress>> findById(long id);
}
