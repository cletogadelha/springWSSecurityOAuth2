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
	private String localTrabalho;
	private String nome;
	private String biografia;
	private String profissao;
	
	@OneToMany(mappedBy="collaborator", cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	private Set<Competency> competencies;
	
	private String endereco;
	
	@OneToMany(mappedBy="collaborator", cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	private Set<Contact> contactList;
	
	public Collaborator(){
		
	}
	
	public Collaborator(String nome, String profissao, String localTrabalho){
		this.nome = nome;
		this.profissao = profissao;
		this.localTrabalho = localTrabalho;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLocalTrabalho() {
		return localTrabalho;
	}

	public void setLocalTrabalho(String localTrabalho) {
		this.localTrabalho = localTrabalho;
	}

	public String getBiografia() {
		return biografia;
	}

	public void setBiografia(String biografia) {
		this.biografia = biografia;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
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
