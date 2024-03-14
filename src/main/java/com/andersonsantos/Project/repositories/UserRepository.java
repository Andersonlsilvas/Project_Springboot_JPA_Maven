package com.andersonsantos.Project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andersonsantos.Project.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
