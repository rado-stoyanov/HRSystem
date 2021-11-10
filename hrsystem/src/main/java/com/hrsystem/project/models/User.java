package com.hrsystem.project.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "td_user")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "account")
	private String account;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "phone")
	private int phone;
	
	@OneToOne
	private Employe employe;
	
	@OneToOne
	private Employer employer;
	
	@OneToOne
	private HumanResources humanResources;
	
	public User() {
		
	}

	public User(String account, String password, String email, int phone, Employe employe, Employer employer,
			HumanResources humanResources) {
		this.account = account;
		this.password = password;
		this.email = email;
		this.phone = phone;
		this.employe = employe;
		this.employer = employer;
		this.humanResources = humanResources;
	}

	public int getId() {
		return id;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public Employe getEmploye() {
		return employe;
	}

	public void setEmploye(Employe employe) {
		this.employe = employe;
	}

	public Employer getEmployer() {
		return employer;
	}

	public void setEmployer(Employer employer) {
		this.employer = employer;
	}

	public HumanResources getHumanResources() {
		return humanResources;
	}

	public void setHumanResources(HumanResources humanResources) {
		this.humanResources = humanResources;
	}
}
