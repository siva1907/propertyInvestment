package com.feuji.propertyInvestment.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.feuji.propertyInvestment.entity.Customer;
import com.feuji.propertyInvestment.services.CustomerServices;
import com.feuji.proppertyInvestment.repo.CustomerRepositary;

@Service
public class CustomerServiceImpl implements CustomerServices {
	@Autowired
	CustomerRepositary customerRepositary;

	@Override
	public void save(Customer customer) {
		customerRepositary.save(customer);
	}

	@Override
	public void update(Customer customer) {
		customerRepositary.save(customer);
		
	}

	@Override
	public void delete(int id) {
		customerRepositary.deleteById(id);
		
	}

	@Override
	public List<Customer> getCustomer() {
		
		return customerRepositary.findAll();
	}

	

	@Override
	public void save(int id) {
		customerRepositary.save(customerRepositary.findById(id).get());
		
	}

	@Override
	public Customer findById(int id) {
		
	return customerRepositary.findById(id).get();
		
	}
}
