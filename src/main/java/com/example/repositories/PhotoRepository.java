package com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.Photos;

public interface PhotoRepository extends JpaRepository<Photos, Long> {

}
