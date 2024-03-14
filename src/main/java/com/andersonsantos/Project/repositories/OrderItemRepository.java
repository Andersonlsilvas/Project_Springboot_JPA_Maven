package com.andersonsantos.Project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andersonsantos.Project.entities.OrderItem;
import com.andersonsantos.Project.entities.pk.OrderItemPk;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPk>{
	
}
