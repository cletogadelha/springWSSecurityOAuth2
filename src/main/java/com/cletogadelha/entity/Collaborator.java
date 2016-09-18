package com.cletogadelha.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Collaborator {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String workLocation;
	private String name;
	private String biography;
	private String profession;
	
	@OneToMany(mappedBy="collaborator", cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	private Set<Competency> competencies;
	
	private String address;
	
	@OneToMany(mappedBy="collaborator", cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	private Set<Contact> contactList;
	
	public Collaborator(){
	}
	
	public Collaborator(String name, String profession, String workLocation){
		this.name = name;
		this.profession = profession;
		this.workLocation = workLocation;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getWorkLocation() {
		return workLocation;
	}

	public void setWorkLocation(String workLocation) {
		this.workLocation = workLocation;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBiography() {
		return biography;
	}

	public void setBiography(String biography) {
		this.biography = biography;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Set<Competency> getCompetencies() {
		return competencies;
	}

	public void setCompetencies(Set<Competency> competencies) {
		this.competencies = competencies;
	}

	public Set<Contact> getContactList() {
		return contactList;
	}

	public void setContactList(Set<Contact> contactList) {
		this.contactList = contactList;
	}

	
}
