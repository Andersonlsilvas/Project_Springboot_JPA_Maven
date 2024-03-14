package com.andersonsantos.Project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andersonsantos.Project.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
