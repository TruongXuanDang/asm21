package com.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MockController {
	@RequestMapping("/guestbook")
	public String viewGuestbookPage(Model model) {
		return "pages/guestbook";
	}
	
	@RequestMapping("/partyAddress")
	public String viewPartyAddressPage(Model model) {
		return "pages/partyAddress";
	}
	
	@RequestMapping("/photoAlbum")
	public String viewPhotoAlbumPage(Model model) {
		return "pages/photoAlbum";
	}
	
	@RequestMapping("/weddingBlog")
	public String viewWeddingBlogPage(Model model) {
		return "pages/weddingBlog";
	}
	
	@RequestMapping("/wishlist")
	public String viewWishlistPage(Model model) {
		return "pages/wishlist";
	}
}
