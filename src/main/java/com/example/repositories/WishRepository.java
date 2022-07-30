package com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entities.Wishes;

@Repository
public interface WishRepository extends JpaRepository<Wishes, Long> {
	
}

