package com.ecommerce.order_system.Controller;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.order_system.Entity.Product;
import com.ecommerce.order_system.Service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {
	
	
	private ProductService productservice;
	
	@Autowired
	public ProductController(ProductService pr) {
		this.productservice = pr;
	}
	
	@GetMapping("/findInvoiceNo/search")
	public Page<Product> speceficOrder(@RequestParam String invoiceNo,
			@RequestParam(defaultValue = "0") int page,
			@RequestParam(defaultValue = "10") int size) {
		
		return this.productservice.findByInvoiceNo(invoiceNo, page, size);
	}
	
	@GetMapping("/viewProduct")
	public Page<Product> veiwProduct(){
	    
		return this.productservice.viewProducts();
		
	}
	
	

}
