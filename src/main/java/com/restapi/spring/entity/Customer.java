package com.restapi.spring.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String firstname;
	private String lastname;
	private String customerPhone;

	
	@OneToOne(cascade=CascadeType.ALL)
	private BillingAddress billingAddress;
	

	@OneToOne(cascade=CascadeType.ALL)
	private ShippingAddress shippingAddress;

	@OneToOne(cascade=CascadeType.ALL)
	private User user;

	@OneToOne(cascade=CascadeType.ALL)
	private Cart cart;
	
	@OneToOne(cascade=CascadeType.ALL)
	private SalesOrder salesOrder;




}
