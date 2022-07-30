package com.example.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.entities.Entities;
import com.example.entities.Photos;
import com.example.services.EntityService;
import com.example.services.PhotoService;

@Controller
public class PhotoController {
	@Autowired
	private PhotoService service;
	
	@RequestMapping("/photo-album")
	public String viewPhotoAlbumPage(Model model) {
		List<Photos> listPhotos = service.listAll();
		model.addAttribute("listPhotos", listPhotos);
		return "pages/photoAlbum";
	}
}
