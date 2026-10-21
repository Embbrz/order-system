package com.ecommerce.order_system.Controller;

import java.util.List;

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
	public List<Product> speceficOrder(@RequestParam String invoiceNo) {
		return this.productservice.findByInvoiceNo(invoiceNo);
	}
	
	@GetMapping("/viewProduct")
	public List<Product> veiwProduct(){
	    
		return this.productservice.viewProducts();
		
	}
	
	

}
