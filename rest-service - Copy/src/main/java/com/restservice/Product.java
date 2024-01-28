package com.restservice;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "product")

public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(nullable = false)
	private String name;

	@Column(nullable = false)
	private double price;

	public Product(long id, String name, double price) {
		this.id=id;
		this.name=name;
		this.price=price;
	}

	public long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}

	public void setName(String name) {
		this.name=name;
		
	}

	public void setPrice(double price) {
		this.price=price;
	}


	
}
