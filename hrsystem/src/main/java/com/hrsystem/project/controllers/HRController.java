package com.hrsystem.project.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hrsystem.project.models.HumanResources;
import com.hrsystem.project.repositories.HRRepository;

@RestController
@RequestMapping("/hr")
public class HRController {
	
	@Autowired
	public HRRepository hrRepository;
	
	@GetMapping("/")
	public List<HumanResources> getAllUsers(){
		return this.hrRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<HumanResources> getSingleUser(@PathVariable("id") int id){
		Optional<HumanResources> httpResult = this.hrRepository.findById(id);
		return httpResult;
	}	
}
