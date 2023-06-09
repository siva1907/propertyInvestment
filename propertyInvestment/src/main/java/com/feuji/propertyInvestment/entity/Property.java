package com.feuji.propertyInvestment.entity;

/*
 * an entity representing table properties in DataBase
 * pojo class having getters and setters,builder,constructor using lombok
 */

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "properties")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Property {
	@Id
	@Column(name = "property_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "property_name")
	private String name;

	@Column(name = "area")
	private double area;

	@Column(name = "totalCost")
	private double totalCost;

	@Column(name = "shareCost_per_unit")
	private double shareVal;

	@Column(name = "total_no_units")
	private int totalUnits;

	@Column(name = "remaining_units")
	private int remingUnits;

	@Column(name = "starting_date")
	private Date startDate;

	@Column(name = "status")
	private String status;

	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "property_admin", joinColumns = {
            @JoinColumn(name = "property_id", referencedColumnName = "property_id") }, inverseJoinColumns = {
                    @JoinColumn(name = "admin_id", referencedColumnName = "admin_id") })
	@JsonIgnore
	@JsonManagedReference
	private List<Admin> admins;

	@Column(name = "last_modeifedon")
	private Date modifiedOn;

	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="propertyLocation_id",referencedColumnName = "property_loc_id")
	private PropertyLocation propertyLocation;
	
	
	@OneToMany(mappedBy = "propertyId")
	private List<PropertyOrders> orderIds;
	
	{
		this.modifiedOn=new Date();
		this.startDate=new Date();
	}
}
