package com.hrsystem.project.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "td_work_experience")
public class WorkExperience {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "category")
	private String category;
	
	@Column(name = "position")
	private String position;
	
	@Column(name = "company")
	private String company;
	
	@Column(name = "period")
	private int period;
	
	@ManyToOne
	private Employe employe;
	
	public WorkExperience() {
		
	}

	public WorkExperience(String category, String position, String company, int period, Employe employe) {
		this.category = category;
		this.position = position;
		this.company = company;
		this.period = period;
		this.employe = employe;
	}

	public int getId() {
		return id;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getPeriod() {
		return period;
	}

	public void setPeriod(int period) {
		this.period = period;
	}

	public Employe getEmploye() {
		return employe;
	}

	public void setEmploye(Employe employe) {
		this.employe = employe;
	}	
}
