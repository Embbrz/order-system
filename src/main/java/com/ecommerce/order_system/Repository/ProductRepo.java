package com.ecommerce.order_system.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.order_system.Entity.Product;


@Repository
public interface ProductRepo extends JpaRepository<Product, Integer>{
	List<Product> findByInvoiceNo(String invoiceNo);
	

}
