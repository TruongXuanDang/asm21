package com.example.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.Wishes;
import com.example.repositories.WishRepository;

@Service
public class WishService {
	@Autowired
	private WishRepository repo;
	
	public List<Wishes> listAll() {
		return repo.findAll();
	}
}
