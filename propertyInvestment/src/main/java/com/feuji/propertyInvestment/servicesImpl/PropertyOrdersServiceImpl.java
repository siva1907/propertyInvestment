package com.feuji.propertyInvestment.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.feuji.propertyInvestment.entity.PropertyOrders;
import com.feuji.propertyInvestment.services.PropertyOrdersServices;
import com.feuji.proppertyInvestment.repo.PropertyOrdersRepositary;
import com.feuji.proppertyInvestment.repo.PropertyRepositary;
@Service
public class PropertyOrdersServiceImpl implements PropertyOrdersServices {
	
	@Autowired
	PropertyOrdersRepositary propertyOrdersRepositary;


	@Override
	public void save(PropertyOrders propertyOrders) {
		propertyOrdersRepositary.save(propertyOrders);
		
	}

	@Override
	public void update(PropertyOrders propertyOrders) {
		propertyOrdersRepositary.save(propertyOrders);
		
	}

	@Override
	public void delete(int id) {
		propertyOrdersRepositary.deleteById(id);	
		
	}

	@Override
	public List<PropertyOrders> getPropertyOrders() {
		
		return propertyOrdersRepositary.findAll();
	}
	

}