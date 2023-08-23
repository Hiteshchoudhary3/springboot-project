package com.main.service;

import java.awt.print.Pageable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.main.entity.Category;
import com.main.repository.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;

	public Category save(Category c) {
		return categoryRepository.save(c);
	}

	public List<Category> saveall(List<Category> c) {
		return categoryRepository.saveAll(c);
	}

	public String deleteByid(int id) {
		categoryRepository.deleteById(id);
		return "deleted where id =" + id;
	}

	public Category getcategoryByID(int id) {
		return categoryRepository.findById(id).orElse(null);

	}

	public List<Category> getCategoriesByPage(int page, int pageSize) {
		if(page==3) {
		return categoryRepository.findAll();
		}
		else {
			return categoryRepository.findAll();
		}
		
	}

	public List<Category> getallCategory() {
		return categoryRepository.findAll();

	}
	
	public Category updateCategory(int id, Category updatedCategory) {
		Category existingCategory = categoryRepository.findById(id).orElse(null);
		existingCategory.setCategory(updatedCategory.getCategory());
		return categoryRepository.save(existingCategory);
	}
}
