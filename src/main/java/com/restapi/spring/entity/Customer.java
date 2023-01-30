package com.restapi.spring.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String firstname;
	private String lastname;
	private String customerPhone;

	@JsonIgnore 
	@OneToOne(cascade=CascadeType.ALL)
	private BillingAddress billingAddress;
	
	@JsonIgnore 
	@OneToOne(cascade=CascadeType.ALL)
	private ShippingAddress shippingAddress;

	@JsonIgnore 
	@OneToOne(cascade=CascadeType.ALL)
	private User user;

	@JsonIgnore 
	@OneToOne(cascade=CascadeType.ALL)
	private Cart cart;
	
	@JsonIgnore 
	@OneToOne(cascade=CascadeType.ALL)
	private SalesOrder salesOrder;




}
