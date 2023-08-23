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
import com.main.service.CategoryService;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {

	
	@Autowired
	private CategoryService categoryService;
	
	    

	    @PostMapping()
	    public Category createCategory(@RequestBody Category newCategory) {
	       
	        return categoryService.save(newCategory);
	    }
	    @GetMapping()
	    public List<Category> getAllCategories(
	            @RequestParam(defaultValue = "1") int page,
	            @RequestParam(defaultValue = "10") int pageSize) {
	        return categoryService.getCategoriesByPage(page, pageSize);
	    }

	    @GetMapping("/{id}")
	    public Category getCategoryById(@PathVariable int id) {
	        return categoryService.getcategoryByID(id);
	        
	    }
	    @PutMapping("/{id}")
	    public Category updateCategory(@PathVariable int id, @RequestBody Category updatedCategory) {
	        return categoryService.updateCategory(id, updatedCategory);
	    }
	   
	    @DeleteMapping("/{id}")
	    public String deletebyId(@PathVariable int id) {
	    	return categoryService.deleteByid(id);
	    	
	    }

	
}
