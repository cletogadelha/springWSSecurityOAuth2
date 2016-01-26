package com.cletogadelha.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Colaborador {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String localTrabalho;
	private String nome;
	private String biografia;
	private String profissao;
	
//	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
//    @JoinColumn(name="colaborador_id")
//	@JsonManagedReference
//	private List<Competencia> competencias;
	
	private String endereco;
	
//	@Lob
//	private  byte[]  imagem;
	
//	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
//    @JoinColumn(name="colaborador_id")
//	@JsonManagedReference
//	private List<Contato> listaContatos;
	
	public Colaborador(){
		
	}
	
	public Colaborador(String nome, String profissao, String localTrabalho){
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

//	public List<Contato> getListaContatos() {
//		return listaContatos;
//	}
//
//	public void setListaContatos(List<Contato> listaContatos) {
//		this.listaContatos = listaContatos;
//	}

//	public byte[] getImagem() {
//		return imagem;
//	}
//
//	public void setImagem(byte[] imagem) {
//		this.imagem = imagem;
//	}

//	public List<Competencia> getCompetencias() {
//		return competencias;
//	}
//
//	public void setCompetencias(List<Competencia> competencias) {
//		this.competencias = competencias;
//	}

}
