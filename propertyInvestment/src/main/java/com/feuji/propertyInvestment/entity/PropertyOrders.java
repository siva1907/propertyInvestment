package com.feuji.propertyInvestment.entity;
/*
 * an entity representing table propertyOrders in DataBase
 * pojo class having getters and setters,builder,constructor using lombok
 */

import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "PropertyOrder")
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
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "customer_id",referencedColumnName = "customer_id")
	private Customer customerId;
	
	@ManyToOne(cascade = CascadeType.ALL)  
	@JoinColumn(name = "property_id",referencedColumnName = "property_id")
	private Property propertyId;
	
	@Column(name="order_price")
	private double orderPrice;
	
	@Column(name="no_units")
	private int noOfUnits;
	
	private Date orderDate;
	
	{
		this.orderDate=new Date();
		//this.orderPrice=this.propertyId.getShareVal()*this.noOfUnits;
	}

}
