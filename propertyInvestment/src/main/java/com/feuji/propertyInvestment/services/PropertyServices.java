package com.feuji.propertyInvestment.services;

import java.util.List;

import com.feuji.propertyInvestment.entity.Property;

public interface PropertyServices {
	void save(Property property);

	void update(Property property);

	void delete(int id);

	List<Property> getProperties();
	Property findById(int id);
}