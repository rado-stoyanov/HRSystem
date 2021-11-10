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

import com.hrsystem.project.models.User;
import com.hrsystem.project.repositories.UserRepository;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/")
	public List<User> getAllUsers(){
		return this.userRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<User> getSingleUser(@PathVariable("id") int id){
		Optional<User> httpResult = this.userRepository.findById(id);
		return httpResult;
	}
	
	@PostMapping("/")
	public void createUser(@RequestBody User entity) {
		this.userRepository.save(entity);
	}
	
	@PutMapping("/{id}")
	public void updateUser(@RequestBody User entity, @PathVariable("id") int id) {
		Optional<User> httpResult = this.userRepository.findById(id);
		if(httpResult.isPresent()) {
			this.userRepository.updateUser(entity.getAccount(), entity.getPassword(), id);
		}
	}
	
	@DeleteMapping("/{id}")
	public void deleteUser(@PathVariable("id") int id) {
		Optional<User> httpResult = this.userRepository.findById(id);
		if(httpResult.isPresent()) {
			this.userRepository.deleteById(id);
		}		
	}
}
