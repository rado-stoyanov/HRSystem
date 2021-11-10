package com.hrsystem.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.hrsystem.project.models.Employer;

public interface EmployerRepository extends JpaRepository<Employer, Integer>{

	@Modifying
	@Transactional
	@Query(
		value = "UPDATE td_employer " +
				"SET description = ?, address = ? " +
				"WHERE id = ?", 
		nativeQuery = true
	)	
	void updateEmployer(String description, String address, Integer id);
}
