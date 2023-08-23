package com.main.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.main.entity.Category;
import com.main.entity.Product;

import net.bytebuddy.implementation.bind.annotation.Empty;

public interface ProductRepository extends JpaRepository<Product, Integer>{

	


}
