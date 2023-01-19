package com.restapi.spring.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
@Entity
public class ShippingAddress {

	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private long id;
	private String address;
	private String city;
	private String state;
	private String zipcopde;
	private String country;
	@OneToOne(mappedBy = "shippingAddress")
	private Customer customer;
	
}
