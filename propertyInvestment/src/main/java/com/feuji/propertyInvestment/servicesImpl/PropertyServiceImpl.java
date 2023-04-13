package com.feuji.propertyInvestment.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.feuji.propertyInvestment.entity.Property;
import com.feuji.propertyInvestment.services.PropertyServices;
import com.feuji.proppertyInvestment.repo.PropertyRepositary;

@Service
public class PropertyServiceImpl implements PropertyServices {
	@Autowired
	PropertyRepositary propertyRepositary;

	@Override
	public void save(Property property) {

		propertyRepositary.save(property);

	}

	@Override
	public void update(Property property) {
		
		propertyRepositary.saveAndFlush(property);
	}

	@Override
	public void delete(int id) {
		propertyRepositary.deleteById(id);		
	}

	@Override
	public List<Property> getProperties() {
		return propertyRepositary.findAll();
	}

	@Override
	public Property findById(int id) {
		
		return propertyRepositary.findById(id).get();
	}
	
	
}
