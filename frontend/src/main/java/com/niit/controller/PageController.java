package com.niit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class PageController {

	@RequestMapping("/index")
	public String showIndexPage() {
		return "index";
	}
	@RequestMapping("/loginid")
	public String showRegisterPage() {
		return "Register";
	}
	@RequestMapping("/Contact")
	public String showContactUsPage() {
		return "Contact";
	}
	@RequestMapping("/aboutus")
	public String showAboutUsPage() {
		return "AboutUs";
	}
	
}