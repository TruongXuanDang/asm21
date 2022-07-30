package com.example.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.entities.Entities;
import com.example.services.EntityService;

@Controller
public class EntityController {
	@Autowired
	private EntityService service;

	@RequestMapping(value={"", "/", "/wedding-blog"})
	public String viewWeddingBlog(Model model) {
		List<Entities> listEntities = service.listAll();
		model.addAttribute("listEntities", listEntities);
		return "pages/weddingBlog";
	}
	
	@RequestMapping("/overview")
	public String viewOverView(Model model) {
		List<Entities> listEntities = service.listAll();
		model.addAttribute("listEntities", listEntities);
		return "pages/overview";
	}
}
