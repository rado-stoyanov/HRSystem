package com.hrsystem.project.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "td_employer")
public class Employer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "company")
	private String company;
	
	@Column(name = "category")
	private String category;
	
	@Column(name = "city")
	private String city;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "еmployees")
	private int employees;
	
	@OneToOne
	private User user;
	
	@OneToMany(mappedBy = "employer")
	private List<JobAd> jobads;
	
	public Employer() {
		
	}

	public Employer(String company, String category, String city, String address, String description, int employees,
			User user, List<JobAd> jobads) {
		this.company = company;
		this.category = category;
		this.city = city;
		this.address = address;
		this.description = description;
		this.employees = employees;
		this.user = user;
		this.jobads = jobads;
	}

	public int getId() {
		return id;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getEmployees() {
		return employees;
	}

	public void setEmployees(int employees) {
		this.employees = employees;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<JobAd> getJobads() {
		return jobads;
	}

	public void setJobads(List<JobAd> jobads) {
		this.jobads = jobads;
	}
}
