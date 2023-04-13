package com.feuji.proppertyInvestment.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.feuji.propertyInvestment.entity.Customer;

@RepositoryRestResource
public interface CustomerRepositary extends JpaRepository<Customer, Integer>{

}
