package com.hrsystem.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hrsystem.project.models.HumanResources;

public interface HRRepository extends JpaRepository<HumanResources, Integer>{

}
