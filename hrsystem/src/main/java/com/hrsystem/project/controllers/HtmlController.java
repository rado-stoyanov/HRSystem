package com.hrsystem.project.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import com.hrsystem.project.models.Employe;
import com.hrsystem.project.repositories.EmployeRepository;

@Controller
public class HtmlController {
	
	private String controllerPageTitle = "Employe Panel";
	
	@Autowired
	private EmployeRepository employeRepository;
	
	
	@GetMapping("/htmlemploye")
	public String getEmployePage(Model model) {
		
		var employeCollection = this.employeRepository.findAll();
		
		model.addAttribute("title", this.controllerPageTitle);
		model.addAttribute("collection", employeCollection);
		
		return "employe";
	}
	
	
	@GetMapping("/htmlcreateemploye")
	public String getCreateEmployePage(Model model) {
		
		Employe entity = new Employe();
		model.addAttribute("employe", entity);		
		return "create-employe";
	}

	
	@PostMapping("/htmlsaveemploye")
	public RedirectView saveEmploye(@ModelAttribute Employe entity) {

		this.employeRepository.save(entity);
		return new RedirectView("/htmlemploye");
	}
}
