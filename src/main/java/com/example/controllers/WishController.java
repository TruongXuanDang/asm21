package com.example.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.entities.Wishes;
import com.example.services.WishService;

@Controller
public class WishController {
	@Autowired
	private WishService service;

	@RequestMapping("/wish-list")
	public String viewWishList(Model model) {
		List<Wishes> listWishes = service.listAll();
		model.addAttribute("listWishes", listWishes);
		return "pages/wishlist";
	}
}
