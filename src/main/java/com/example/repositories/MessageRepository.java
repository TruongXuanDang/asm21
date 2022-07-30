package com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entities.Messages;

@Repository
public interface MessageRepository extends JpaRepository<Messages, Long> {

}
