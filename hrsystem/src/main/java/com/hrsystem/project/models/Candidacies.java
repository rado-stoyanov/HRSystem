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
@Table(name = "td_candidacies")
public class Candidacies {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "condition")
	private String condition;
	
	@ManyToOne
	private Employe employe;
	
	@ManyToOne
	private JobAd jobad;
	
	@OneToMany(mappedBy = "candidacies")
	private List<Messages> messages;
	
	public Candidacies() {
		
	}

	public Candidacies(String condition, Employe employe, JobAd jobad, List<Messages> messages) {
		this.condition = condition;
		this.employe = employe;
		this.jobad = jobad;
		this.messages = messages;
	}

	public int getId() {
		return id;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public Employe getEmploye() {
		return employe;
	}

	public void setEmploye(Employe employe) {
		this.employe = employe;
	}

	public JobAd getJobad() {
		return jobad;
	}

	public void setJobad(JobAd jobad) {
		this.jobad = jobad;
	}

	public List<Messages> getMessages() {
		return messages;
	}

	public void setMessages(List<Messages> messages) {
		this.messages = messages;
	}	
}
