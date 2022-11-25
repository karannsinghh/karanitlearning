package com.karanit.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="ORDER_TB")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {
	
	@Id
	private Integer orderId;
	private String orderName;
	private Integer orderQuantity;
	private Double orderPrice;

}
