package com.feuji.proppertyInvestment.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.feuji.propertyInvestment.entity.PropertyOrders;

@RepositoryRestResource
public interface PropertyOrdersRepositary extends JpaRepository<PropertyOrders, Integer> {

}
