package com.main.entity;

import java.util.List;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "category")
public class Category {
	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	private String category;
	@OneToMany(mappedBy = "category")
    private List<Product> product;
	
	public Category(int id, String category) {
		super();
		this.id = id;
		this.category = category;
	}

	@Override
	public String toString() {
		return "Category [id=" + id + ", category=" + category +  "]";
	}

	public Category() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	
}
