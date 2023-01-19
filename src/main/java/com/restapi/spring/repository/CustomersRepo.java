package com.restapi.spring.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.restapi.spring.entity.Customer;
import com.restapi.spring.request.CustomerSaveReq;


@Repository
public interface CustomersRepo extends JpaRepository<Customer, Long>{

	Optional<List<Customer>> findByUserId(long userId);
}
