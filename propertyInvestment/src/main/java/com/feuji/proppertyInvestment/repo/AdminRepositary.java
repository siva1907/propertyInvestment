package com.feuji.proppertyInvestment.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.feuji.propertyInvestment.entity.Admin;


public interface AdminRepositary extends JpaRepository<Admin, Integer> {
	
}
