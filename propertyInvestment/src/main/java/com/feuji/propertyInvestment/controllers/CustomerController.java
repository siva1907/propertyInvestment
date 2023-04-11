package com.feuji.propertyInvestment.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.feuji.propertyInvestment.entity.Customer;
import com.feuji.propertyInvestment.servicesImpl.CustomerServiceImpl;

@RestController
public class CustomerController {
	
	@Autowired
	private CustomerServiceImpl customerServiceImpl;
	
	@PostMapping(value = "/customer",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Customer> save(@RequestBody Customer customer) {
		System.out.println(customer);
		customerServiceImpl.save(customer);
		return ResponseEntity.ok().body(customer);
	}
	
	@PutMapping(value = "/customer",produces = MediaType.APPLICATION_JSON_VALUE)
	public  ResponseEntity<Customer> update(@RequestBody Customer customer) {
		customerServiceImpl.update(customer);
		return ResponseEntity.ok().body(customer);
	}
	
	@DeleteMapping(value = "/customer/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
	public void delete(@PathVariable int id ) {
		customerServiceImpl.delete(id);
	}
	
	@GetMapping(value = "/customer/",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Customer>> getCustomers() {
		List<Customer> customers= customerServiceImpl.getCustomer();
		return ResponseEntity.ok().body(customers);
	}

	
}
