package com.andersonsantos.Project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andersonsantos.Project.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
