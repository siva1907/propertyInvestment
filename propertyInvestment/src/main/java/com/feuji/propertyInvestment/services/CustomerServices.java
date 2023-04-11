package com.feuji.propertyInvestment.services;

import java.util.List;

import com.feuji.propertyInvestment.entity.Customer;

public interface CustomerServices {

	void save(Customer customer);
	
	void update(Customer customer);
	
	void delete(int id);
	
	List<Customer> getCustomer();
	
}
