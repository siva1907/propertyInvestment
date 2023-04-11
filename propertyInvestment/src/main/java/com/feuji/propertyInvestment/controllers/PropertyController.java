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
import com.feuji.propertyInvestment.entity.Property;
import com.feuji.propertyInvestment.servicesImpl.PropertyServiceImpl;

@RestController
public class PropertyController {
	@Autowired
	PropertyServiceImpl propertyServiceImpl;
	
	@PostMapping(value = "/property",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Property> save(@RequestBody Property property) {
		propertyServiceImpl.save(property);
		return ResponseEntity.ok().body(property);
	}
	
	@PutMapping(value = "/property",produces = MediaType.APPLICATION_JSON_VALUE)
	public  ResponseEntity<Property> update(@RequestBody Property property) {
		propertyServiceImpl.update(property);
		return ResponseEntity.ok().body(property);
	}
	
	@DeleteMapping(value = "/property/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
	public void delete(@PathVariable int id ) {
		propertyServiceImpl.delete(id);
	}
	
	@GetMapping(value = "/property",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Property>> getAdmins() {
		List<Property> properties= propertyServiceImpl.getProperties();
		return ResponseEntity.ok().body(properties);
	}
}
