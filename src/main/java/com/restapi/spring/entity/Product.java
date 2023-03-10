package com.restapi.spring.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Data;
@Data
@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "id" , nullable = false)
	private long id;
	private String category;
	private String description;
	private String manufacturer;
	private String name;
	private String price;
	private String unit;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id")
	private CartItem cartItem;
}
