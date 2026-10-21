package com.ecommerce.order_system.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.order_system.Entity.Product;
import com.ecommerce.order_system.Repository.ProductRepo;

@Service
public class ProductService {
	
	
	private ProductRepo productrepo;
	
	@Autowired
	public ProductService(ProductRepo pr) {
		this.productrepo = pr;
	}
	
	public List<Product> viewProducts(){
		return productrepo.findAll().stream().limit(10).toList();
		
	}
	
	public List<Product> findByInvoiceNo(String invoiceNo){
		return productrepo.findByInvoiceNo(invoiceNo);


		
		
	}

}
