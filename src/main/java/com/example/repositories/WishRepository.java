package com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.Wishes;

public interface WishRepository extends JpaRepository<Wishes, Long> {
	
}

