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

import com.feuji.propertyInvestment.entity.Admin;
import com.feuji.propertyInvestment.servicesImpl.AdminServiceImpl;

@RestController
public class AdminController {
	
	@Autowired
	AdminServiceImpl adminServiceImpl;
	
	@PostMapping(value = "/admin",produces = MediaType.APPLICATION_JSON_VALUE)
	public  ResponseEntity<Admin> save(@RequestBody Admin admin) {
		adminServiceImpl.save(admin);
		return ResponseEntity.ok().body(admin);
	}
	
	@PutMapping(value = "/admin",produces = MediaType.APPLICATION_JSON_VALUE)
	public  ResponseEntity<Admin> update(@RequestBody Admin admin) {
		adminServiceImpl.update(admin);
		return ResponseEntity.ok().body(admin);
	}
	
	@DeleteMapping(value = "/admin/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
	public void delete(@PathVariable int id ) {
		adminServiceImpl.delete(id);
	}
	
	@GetMapping(value = "/admin",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Admin>> getAdmins() {
		List<Admin> admins= adminServiceImpl.getAdmins();
		return ResponseEntity.ok().body(admins);
	}

}
