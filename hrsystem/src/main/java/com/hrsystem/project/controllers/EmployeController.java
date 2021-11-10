package com.hrsystem.project.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hrsystem.project.models.Employe;
import com.hrsystem.project.repositories.EmployeRepository;

@RestController
@RequestMapping("/employe")
public class EmployeController {

	@Autowired
	private EmployeRepository employeRepository;
	
	@GetMapping("/")
	public List<Employe> getAllEmploye(){
		return this.employeRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<Employe> getSingleEmploye(@PathVariable("id") int id) {	
		Optional<Employe> httpResult = this.employeRepository.findById(id);		
		return httpResult;
	}
	
	@PostMapping("/")
	public void createEmploye(@RequestBody Employe entity) {
		this.employeRepository.save(entity);
	}
	
	@PutMapping("/{id}")
	public void updateEmploye(@RequestBody Employe entity, @PathVariable("id") int id) {
		Optional<Employe> httpResult = this.employeRepository.findById(id);	
		if(httpResult.isPresent()) {
			this.employeRepository.updateEmploye(entity.getCity(), entity.getUniversity(), id);
		}
	}
	
	@DeleteMapping("/{id}")
	public void removeEmploye(@PathVariable("id") int id) {
		Optional<Employe> httpResult = this.employeRepository.findById(id);			
		if(httpResult.isPresent()) {
			this.employeRepository.deleteById(id);
		}		
	}	
}
