package com.example.mtruck.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.mtruck.dto.NoticeDto;
import com.example.mtruck.service.NoticeService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class IndexController {
	
	@Autowired
	NoticeService noticeService;
	
	@GetMapping("/")
	public String indexPage(Model model) {
		log.debug("aaa");
		
		
		model.addAttribute("username", "edel");
		return "index";
	}
	
	@GetMapping("/test")
	public String testIndex(Model model) {
		ArrayList<NoticeDto> list = noticeService.getNoticeList();
		
		
		model.addAttribute("username", "edel");
		model.addAttribute("noticeList", list);
		return "/test/index";
	}

	@GetMapping("/page1")
	public String page1(Model model) {
		
		model.addAttribute("username", "edel");
		return "/page1";
	}
}
