package com.hrsystem.project.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "td_messages")
public class Messages {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "message")
	private String message;
	
	@ManyToOne
	private Candidacies candidacies;

	public Messages() {
		
	}

	public Messages(String message, Candidacies candidacies) {
		this.message = message;
		this.candidacies = candidacies;
	}

	public int getId() {
		return id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Candidacies getCandidacies() {
		return candidacies;
	}

	public void setCandidacies(Candidacies candidacies) {
		this.candidacies = candidacies;
	}
}
