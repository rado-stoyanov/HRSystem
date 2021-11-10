package com.hrsystem.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.hrsystem.project.models.User;


public interface UserRepository extends JpaRepository<User, Integer>{

	@Modifying
	@Transactional
	@Query(
		value = "UPDATE td_user " +
				"SET account = ?, password = ? " +
				"WHERE id = ?", 
		nativeQuery = true
	)	
	void updateUser(String account, String password, Integer id);
}
