package com.example.mtruck.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
	
	@GetMapping("/")
	public String indexPage(Model model) {
		
		model.addAttribute("username", "edel");
		return "index";
	}
	
	@GetMapping("/test")
	public String testIndex(Model model) {
		
		model.addAttribute("username", "edel");
		return "/test/index";
	}

	@GetMapping("/page1")
	public String page1(Model model) {
		
		model.addAttribute("username", "edel");
		return "/page1";
	}
}
