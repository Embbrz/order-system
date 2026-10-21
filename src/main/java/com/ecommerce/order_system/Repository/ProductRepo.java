package com.ecommerce.order_system.Repository;




import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import org.springframework.data.domain.Page;

import org.springframework.data.domain.Pageable;


import com.ecommerce.order_system.Entity.Product;


@Repository
public interface ProductRepo extends JpaRepository<Product, Integer>{
	Page<Product> findByInvoiceNo(String invoiceNo, Pageable pageable);
	
	
	Page<Product> findByCountry(String country, Pageable pageable);
	
	Page<Product> findByCustomerID(int customerID, Pageable pageable);

}
