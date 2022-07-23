package com.example.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.Entities;
import com.example.repositories.EntityRepository;

@Service
public class EntityService {
	@Autowired
	private EntityRepository repo;
	
	public List<Entities> listAll() {
		return repo.findAll();
	}
}
