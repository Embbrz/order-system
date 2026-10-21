package com.ecommerce.order_system.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
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
			@RequestParam(defaultValue = "0") int page,
			@RequestParam(defaultValue = "10") int size) {
		
		return this.productservice.findByInvoiceNo(invoiceNo, page, size);
	}
	
	@GetMapping("/filterByCountry/{country}")
	public Page<Product> filterByCountry(@PathVariable String country,
			@RequestParam(defaultValue = "0") int page,
			@RequestParam(defaultValue = "0") int size){
		return this.productservice.filterByCountry(country, page, size);
	}
	
	@GetMapping("/{page}")
	public Page<Product> viewAll(@PathVariable Integer page){
		return this.productservice.getAll(page);
	}
	
	@GetMapping("/SearchByCustomerIDHistory/{id}/")
	public Page<Product> findCustomerId(@PathVariable int id,
			@RequestParam(defaultValue = "0") int page){
		return this.productservice.findCustomerIdHistory(id, page);
	}
	
	@GetMapping("/viewProduct")
	public Page<Product> veiwProduct(){
	    
		return this.productservice.viewProducts();
		
	}
	
	

}
