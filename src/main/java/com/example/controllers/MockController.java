package com.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MockController {
	@RequestMapping("/party-address")
	public String viewPartyAddressPage(Model model) {
		return "pages/partyAddress";
	}
}
