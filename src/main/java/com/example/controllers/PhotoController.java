package com.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PhotoController {
	@RequestMapping("/photo-album")
	public String viewPhotoAlbumPage(Model model) {
		return "pages/photoAlbum";
	}
}
