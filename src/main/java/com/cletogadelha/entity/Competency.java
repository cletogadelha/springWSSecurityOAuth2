package com.cletogadelha.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Competency {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String id;
	private String description;
	
	@ManyToOne
	@JsonBackReference
	@JoinColumn(name="collaborator_id")
    private Collaborator collaborator;	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Collaborator getCollaborator() {
		return collaborator;
	}
	public void setCollaborator(Collaborator collaborator) {
		this.collaborator = collaborator;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

}
