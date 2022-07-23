package com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.Entities;

public interface EntityRepository extends JpaRepository<Entities, Long> {
	
}
