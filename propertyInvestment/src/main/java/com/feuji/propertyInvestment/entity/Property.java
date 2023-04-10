package com.feuji.propertyInvestment.entity;



import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="properties")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Property {
	@Id
	@Column(name="property_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "property_name")
	private String name;
	
	@Column(name = "area")
	private double area;
	
	@Column(name="totalCost")
	private double totalCost;
	
	@Column(name="shareCost_per_unit")
	private double shareVal;
	
	@Column(name = "total_no_units")
	private int totalUnits;
	
	@Column(name="remaining_units")
	private int remingUnits;
	
	@Column(name="starting_date")
	private Date startingDate;
	
	@Column(name="status")
	private String status;
	
	
	@OneToMany(cascade = CascadeType.ALL)
	@Column(name="admin_id")
	private List<Admin> admin;
	
	@Column(name="last_modeifedon")
	private Date modifiedOn;
	
	

}
