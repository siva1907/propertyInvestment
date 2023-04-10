package com.feuji.propertyInvestment.entity;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="admin")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Admin {
	@Id
	@Column(name="admin_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int adminId;
	
	@Column(name="admin_name")
	private String adminName;
	
	@Column(name="admin_password")
	private String password;
	
	@Column(name="status")
	private String status;
	
	@ManyToMany(cascade = CascadeType.ALL,mappedBy = "properties")
	private List<Property> property;
	

}
