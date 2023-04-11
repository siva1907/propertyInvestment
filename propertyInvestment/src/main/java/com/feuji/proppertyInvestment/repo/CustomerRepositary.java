package com.feuji.proppertyInvestment.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.feuji.propertyInvestment.entity.Customer;

public interface CustomerRepositary extends JpaRepository<Customer, Integer>{

}
