package com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.Messages;

public interface MessageRepository extends JpaRepository<Messages, Long> {

}
