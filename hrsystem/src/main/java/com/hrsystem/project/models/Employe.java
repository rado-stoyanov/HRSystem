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
@Table(name = "td_employe")
public class Employe {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
		
	@Column(name = "age")
	private int age;
	
	@Column(name = "city")
	private String city;
	
	@Column(name = "university")
	private String university;
	
	@OneToOne
	private User user;
	
	@OneToMany(mappedBy = "employe")
	private List<WorkExperience> workеxperiences;
	
	@OneToMany(mappedBy = "employe")
	private List<Candidacies> candidacies;
	
	
	public Employe() {

	}


	public Employe(String firstName, String lastName, int age, String city, String university, User user,
			List<WorkExperience> workеxperiences, List<Candidacies> candidacies) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.city = city;
		this.university = university;
		this.user = user;
		this.workеxperiences = workеxperiences;
		this.candidacies = candidacies;
	}


	public int getId() {
		return id;
	}

	
	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getUniversity() {
		return university;
	}


	public void setUniversity(String university) {
		this.university = university;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public List<WorkExperience> getWorkеxperiences() {
		return workеxperiences;
	}


	public void setWorkеxperiences(List<WorkExperience> workеxperiences) {
		this.workеxperiences = workеxperiences;
	}


	public List<Candidacies> getCandidacies() {
		return candidacies;
	}


	public void setCandidacies(List<Candidacies> candidacies) {
		this.candidacies = candidacies;
	}	
}
