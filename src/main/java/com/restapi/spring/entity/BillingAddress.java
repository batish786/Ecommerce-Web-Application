package com.restapi.spring.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import lombok.Data;

@Data
@Entity
public class BillingAddress {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String address;
	private String city;
	private String state;
	private String zipcode;
	private String country;
	@OneToOne(mappedBy = "billingAddress")
	private Customer customer;
}