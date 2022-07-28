package com.example.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Product;
import com.example.entities.Entities;
import com.example.entities.Messages;
import com.example.repositories.EntityRepository;
import com.example.repositories.MessageRepository;

@Service
public class MessageService {
	@Autowired
	private MessageRepository repo;
	
	public List<Messages> listAll() {
		return repo.findAll();
	}
	
	public void save(Messages message) {
		repo.save(message);
	}
}
