package com.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.entity.Category;
import com.main.entity.Product;
import com.main.repository.ProductRepository;
@Service
public class ProductService {
	@Autowired
	private ProductRepository  productRepository;
	
	public Product save(Product p) {
		return productRepository.save(p);
	}
	public List<Product> saveall(List<Product>  p) {
		return productRepository.saveAll(p);
	}
	public String deleteByid(int id) {
		productRepository.deleteById(id);
		 return "deleted where id ="+id;
	}
	public Product getproductByID(int id) {
		return productRepository.findById(id).orElse(null);
		
	}
	public List<Product> getallproduct(int page) {
		return productRepository.findAll();
	
	}
	public Product updateproduct(int id,Product p) {
		Product extingproduct= productRepository.findById(id).orElse(null);
         extingproduct.setName(p.getName());
         extingproduct.setPrice(p.getPrice());
		return productRepository.save(extingproduct);
		
		
	}
}
