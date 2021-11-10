package com.hrsystem.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.hrsystem.project.models.Employe;


public interface EmployeRepository extends JpaRepository<Employe, Integer>{
	
	@Modifying
	@Transactional
	@Query(
		value = "UPDATE td_employe " +
				"SET city = ?, university = ? " +
				"WHERE id = ?", 
		nativeQuery = true
	)	
	void updateEmploye(String city, String university, Integer id);

}



