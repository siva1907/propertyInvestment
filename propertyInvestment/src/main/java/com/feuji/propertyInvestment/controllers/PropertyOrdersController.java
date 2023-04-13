package com.feuji.propertyInvestment.controllers;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.feuji.propertyInvestment.entity.Customer;
import com.feuji.propertyInvestment.entity.Property;
import com.feuji.propertyInvestment.entity.PropertyOrders;
import com.feuji.propertyInvestment.servicesImpl.CustomerServiceImpl;
import com.feuji.propertyInvestment.servicesImpl.PropertyOrdersServiceImpl;
import com.feuji.propertyInvestment.servicesImpl.PropertyServiceImpl;
import com.feuji.proppertyInvestment.repo.CustomerRepositary;
import com.feuji.proppertyInvestment.repo.PropertyOrdersRepositary;
import com.feuji.proppertyInvestment.repo.PropertyRepositary;

@RestController
public class PropertyOrdersController {
	@Autowired(required=true)
	private PropertyOrdersServiceImpl propertyOrderImpl;
	@Autowired
	private CustomerServiceImpl customerOrderImpl;
	@Autowired
	private PropertyServiceImpl  propertyimpl;


	@PostMapping("/saveorder/customer/{cid}/property/{pid}")
	public ResponseEntity<PropertyOrders> save(@RequestBody PropertyOrders orders, @PathVariable int cid,
			@PathVariable int pid) {
		System.out.println(cid+" "+pid);
		orders.setPropertyId(propertyimpl.findById(pid));
		orders.setCustomerId(customerOrderImpl.findById(cid));
		propertyOrderImpl.save(orders);
		return ResponseEntity.ok().body(orders);

	}

	@GetMapping("bycustomer/{id}")
	public List<PropertyOrders> get(@PathVariable int id, Customer customer) {
		List<PropertyOrders> l1 = propertyOrderImpl.getPropertyOrders();
		return l1.stream().filter(e -> e.getCustomerId().getId() == id).collect(Collectors.toList());

	}

}