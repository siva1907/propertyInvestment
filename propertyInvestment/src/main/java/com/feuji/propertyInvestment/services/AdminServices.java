package com.feuji.propertyInvestment.services;

import java.util.List;

import com.feuji.propertyInvestment.entity.Admin;

public interface AdminServices {
	void save(Admin admin);

	void update(Admin admin);
	
	void delete(int id);
	
	List<Admin> getAdmins();
}
