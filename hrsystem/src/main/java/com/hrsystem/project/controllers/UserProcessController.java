package com.hrsystem.project.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import com.hrsystem.project.models.User;
import com.hrsystem.project.repositories.UserRepository;

@Controller
public class UserProcessController {
	
	@Autowired
	private UserRepository userRepository;

	@GetMapping("/signup")
	public String getSignupPage(Model model) {
		
		model.addAttribute("user", new User());
		return "signup";
	}
	
	@GetMapping("/signin")
	public String getSigninPage() {
		return "signin";
	}
	
	@PostMapping("/authentication")
	public void processAuthentication() {
		
	}
	
	@PostMapping("/authorization")
	public RedirectView processAuthorization(@ModelAttribute User entity) {
		
		this.userRepository.save(entity);
		return new RedirectView("/signin");	
	}
}
