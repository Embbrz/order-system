package com.ecommerce.order_system.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	public Page<Product> filterByInvoiceNo(@RequestParam String invoiceNo, 
			@PageableDefault(page = 0, size = 20)Pageable pageable) {
		
		
		return this.productservice.findByInvoiceNo(invoiceNo, pageable);
	}
	
	@GetMapping("/filterByCountry/{country}")
	public Page<Product> filterByCountry(@PathVariable String country,
			@PageableDefault(page = 0, size = 20)Pageable pageable){
		
		return this.productservice.filterByCountry(country, pageable);
	}
	
	@GetMapping
	public Page<Product> viewAll(@PageableDefault(page = 0, size = 20)Pageable pageable){
		return this.productservice.getAll(pageable);
	}
	
	@GetMapping("/SearchByCustomerIDHistory/{id}/")
	public Page<Product> findCustomerId(@PathVariable int id, 
			@PageableDefault(page = 0, size = 20)Pageable pageable){
		return this.productservice.findCustomerIdHistory(id, pageable);
	}
	
	@GetMapping("/viewProduct/")
	public Page<Product> veiwProduct(@PageableDefault(page = 0, size = 20)Pageable pageable){
	    
		return this.productservice.viewProducts(pageable);
		
	}
	
	

}
