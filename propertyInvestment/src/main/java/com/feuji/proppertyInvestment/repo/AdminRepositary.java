package com.feuji.proppertyInvestment.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.feuji.propertyInvestment.entity.Admin;

@RepositoryRestResource
public interface AdminRepositary extends JpaRepository<Admin, Integer> {
	
}
