package com.example.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.Product;
import com.example.entities.Entities;
import com.example.entities.Messages;
import com.example.services.EntityService;
import com.example.services.MessageService;

@Controller
public class MessageController {
	@Autowired
	private MessageService service;

	@RequestMapping("/guest-book")
	public String viewGuuestBook(Model model) {
		List<Messages> listMessages = service.listAll();
		Messages message = new Messages();
		model.addAttribute("listMessages", listMessages);
		model.addAttribute("messages", message);
		return "pages/guestbook";
	}
	
	@RequestMapping(value="/saveMessage", method= RequestMethod.POST)
	public String saveProduct(@Valid Messages message, BindingResult result, Model model) {
		if (result.hasErrors()) {
		    return "pages/guestbook";
		}
		service.save(message);
		return "redirect:/guest-book";
	}
}
