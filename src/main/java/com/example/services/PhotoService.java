package com.example.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.Photos;
import com.example.repositories.PhotoRepository;

@Service
public class PhotoService {
	@Autowired
	private PhotoRepository repo;
	
	public List<Photos> listAll() {
		return repo.findAll();
	}
}
