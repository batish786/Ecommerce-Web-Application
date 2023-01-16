package com.restapi.spring.repository;


import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.restapi.spring.entity.BillingAddress;
import com.restapi.spring.request.BillingDataRequest;

public interface BillingRepos extends JpaRepository<BillingAddress, Integer>{

	Optional<List<BillingAddress>> findByAddress(String address);

	boolean save(BillingDataRequest dataRequest);
	public List<BillingAddress> findById(long id);
}
