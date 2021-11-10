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

import com.hrsystem.project.models.Employer;
import com.hrsystem.project.repositories.EmployerRepository;

@RestController
@RequestMapping("/employer")
public class EmployerController {
	
	@Autowired
	private EmployerRepository employerRepository;
	
	@GetMapping("/")
	public List<Employer> getAllEmployer(){
		return this.employerRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<Employer> getSingleEmployer(@PathVariable("id") int id){
		Optional<Employer> httpResult = this.employerRepository.findById(id);
		return httpResult;
	}
	
	@PostMapping("/")
	public void createEmployer(@RequestBody Employer entity) {
		this.employerRepository.save(entity);
	}
	
	@PutMapping("/{id}")
	public void updateEmployer(@RequestBody Employer entity, @PathVariable("id") int id) {
		Optional<Employer> httpResult = this.employerRepository.findById(id);
		if(httpResult.isPresent()) {
			this.employerRepository.updateEmployer(entity.getDescription(), entity.getAddress(), id);
		}
	}
	
	@DeleteMapping("/id")
	public void deleteEmployer(@PathVariable("id") int id) {
		Optional<Employer> httpResult = this.employerRepository.findById(id);
		if(httpResult.isPresent()) {
			this.employerRepository.deleteById(id);
		}
	}
}
