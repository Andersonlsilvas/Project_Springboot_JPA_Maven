package com.andersonsantos.Project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andersonsantos.Project.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
