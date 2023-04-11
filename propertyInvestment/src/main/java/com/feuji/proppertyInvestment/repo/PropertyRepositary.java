package com.feuji.proppertyInvestment.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.feuji.propertyInvestment.entity.Property;


public interface PropertyRepositary extends JpaRepository<Property, Integer> {
	
}
