package com.ecommerce.order_system.Service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

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
	
	public Page<Product> viewProducts(){
		Pageable page = PageRequest.of(0, 10);
		return productrepo.findAll(page);
		
	}
	
	public Page<Product> filterByCountry(String country, int page, int size){
		Pageable pageable = PageRequest.of(page, size);
		return productrepo.findByCountry(country, pageable);
	}
	
	public Page<Product> findByInvoiceNo(String invoiceNo, int page, int size){
		Pageable pageable = PageRequest.of(page, size);
		return productrepo.findByInvoiceNo(invoiceNo, pageable);
		
		


		
		
	}

}
