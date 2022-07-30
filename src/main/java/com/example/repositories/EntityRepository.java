package com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entities.Entities;

@Repository
public interface EntityRepository extends JpaRepository<Entities, Long> {
	
}
