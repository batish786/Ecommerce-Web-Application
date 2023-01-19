package com.restapi.spring.entity;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
@Entity
public class SalesOrder {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String cart_id;
	private String customer_id;
	private String shippingAddress_id;
	private String billingAddress_id;
	@OneToOne(mappedBy = "salesOrder")
	private Customer customer;
}

