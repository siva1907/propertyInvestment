package com.feuji.propertyInvestment.services;


import java.util.List;

import com.feuji.propertyInvestment.entity.PropertyOrders;


public interface PropertyOrdersServices {
	
	void save(PropertyOrders propertyOrders);
	
    void update(PropertyOrders propertyOrders);
	
	void delete(int id);
	
	List<PropertyOrders> getPropertyOrders();
	

}