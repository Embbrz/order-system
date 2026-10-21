package com.ecommerce.order_system.Entity;

import java.time.LocalDateTime;

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
	
	
	
	private String invoiceNo;
	private String stock_code;
	private String description;
	private Integer quantity;
	private LocalDateTime invoice_date;
	private double unit_price;
	private Integer customer_id;
	private String country;
	

}
