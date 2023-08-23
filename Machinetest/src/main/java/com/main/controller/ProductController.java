package com.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.main.entity.Category;
import com.main.entity.Product;
import com.main.service.ProductService;


@RestController
@RequestMapping("/api/product")
public class ProductController {

	@Autowired
	private ProductService productservice;
	
	    
	    @PostMapping()
	    public Product createCategory(@RequestBody Product newproduct) {
	       
	        return productservice.save(newproduct);
	    }
	    @GetMapping()
	    public List<Product> getAllProduct(
	            @RequestParam(defaultValue = "1") int page) {
	        return productservice.getallproduct(page);
	    }

	    @GetMapping("/{id}")
	    public Product getCategoryById(@PathVariable int id) {
	    	return productservice.getproductByID(id);
	       
	    }
	    @PutMapping("/{id}")
	    public Product updateCategory(@PathVariable int id,@RequestBody Product p) {
	        return productservice.updateproduct(id, p);
	    }
	   
	    @DeleteMapping("/{id}")
	    public String deletebyId(@PathVariable int id) {
	    	return productservice.deleteByid(id);
	    	
	    }

}
