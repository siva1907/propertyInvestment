package com.feuji.propertyInvestment.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.feuji.propertyInvestment.entity.Admin;
import com.feuji.propertyInvestment.services.AdminServices;
import com.feuji.proppertyInvestment.repo.AdminRepositary;

@Service
public class AdminServiceImpl implements AdminServices {
	
	@Autowired
	AdminRepositary adminRepositary;

	@Override
	public void save(Admin admin) {
		adminRepositary.save(admin);

	}
	
	@Override
	public void update(Admin admin) {
		adminRepositary.saveAndFlush(admin);

	}

	@Override
	public void delete(int id) {
		adminRepositary.deleteById(id);
		
	}

	@Override
	public List<Admin> getAdmins() {
		
		return adminRepositary.findAll();
	}

}
