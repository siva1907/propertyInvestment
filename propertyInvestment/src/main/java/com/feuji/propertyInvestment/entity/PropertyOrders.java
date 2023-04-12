package com.feuji.propertyInvestment.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

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
public class PropertyOrders {
	 	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name="order_id")
	private int orderId;
	@ManyToOne
	@JoinColumn(name = "customer_order_id",referencedColumnName = "customer_id")
	private Customer customerId;
	@ManyToOne  
	@JoinColumn(name = "property_order_id",referencedColumnName = "property_id")
	private Property PropertyId;
	
	private Date orderDate;

}
