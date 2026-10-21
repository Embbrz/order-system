package com.ecommerce.order_system.Service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.ecommerce.order_system.Entity.Product;
import com.ecommerce.order_system.Repository.ProductRepo;

@Service
public class ProductService {
	
	
	private final ProductRepo productrepo;
	
	@Autowired
	public ProductService(ProductRepo pr) {
		this.productrepo = pr;
	}
	
	public Page<Product> viewProducts(Pageable pageable){
		
		return productrepo.findAll(pageable);
		
	}
	
	public Page<Product> getAll(Pageable pageable){
		
		return productrepo.findAll(pageable);
	}
	
	public Page<Product> findCustomerIdHistory(int id, Pageable pageable){
		return this.productrepo.findByCustomerID(id, pageable);

		
	}
	
	public Page<Product> filterByCountry(String country, Pageable pageable){
		
		return productrepo.findByCountry(country, pageable);
	}
	
	public Page<Product> findByInvoiceNo(String invoiceNo, Pageable pageable){

		return productrepo.findByInvoiceNo(invoiceNo, pageable);
		
		


		
		
	}

}
