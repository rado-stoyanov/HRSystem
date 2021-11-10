package com.hrsystem.project.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "td_jobad")
public class JobAd {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "category")
	private String category;
	
	@Column(name = "position")
	private String position;
	
	@Column(name = "salary")
	private int salary;
	
	@ManyToOne
	private Employer employer;
	
	@OneToMany(mappedBy = "jobad")
	private List<Candidacies> candidacies;
	
	public JobAd() {
		
	}

	public JobAd(String category, String position, int salary, Employer employer, List<Candidacies> candidacies) {
		this.category = category;
		this.position = position;
		this.salary = salary;
		this.employer = employer;
		this.candidacies = candidacies;
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

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Employer getEmployer() {
		return employer;
	}

	public void setEmployer(Employer employer) {
		this.employer = employer;
	}

	public List<Candidacies> getCandidacies() {
		return candidacies;
	}

	public void setCandidacies(List<Candidacies> candidacies) {
		this.candidacies = candidacies;
	}	
}
