package com.main.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.main.entity.Category;
@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {

//    @Query("SELECT c FROM Category c ORDER BY c.id ASC")
//    List<Category> getCategoriesWithPagination(int offset, int pageSize);

}
