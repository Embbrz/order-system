package com.ecommerce.order_system.Entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "e_commerce_transactions")
@NoArgsConstructor
public class Product {
	
	@Id
	private Integer id;
	
	
	@Column(name = "invoiceNo")
	private String invoiceNo;
	@Column(name = "stock_code")
	private String stock_code;
	@Column(name = "description")
	private String description;
	@Column(name = "quantity")
	private Integer quantity;
	@Column(name = "LocalDateTime")
	private LocalDateTime invoiceDate;
	@Column(name = "unit_price")
	private double unitPrice;
	@Column(name = "customer_id")
	private Integer customerID;
	@Column(name = "country")
	private String country;
	

}
