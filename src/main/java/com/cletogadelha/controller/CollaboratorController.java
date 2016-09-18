package com.cletogadelha.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cletogadelha.entity.Collaborator;
import com.cletogadelha.sevice.CollaboratorService;

@RestController
@RequestMapping("/rest/collaborator")
public class CollaboratorController {
	
	@Autowired
	private CollaboratorService collabService;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public Collaborator getDetalhesColaborador(@PathVariable("id") Integer id) {
		return collabService.getDetails(id);
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Collaborator> getListaColaboradores() {
		return collabService.getCollaboratorsList();
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public Collaborator salvarColaborador(@RequestBody @Valid Collaborator colab){
		return collabService.saveCollaborator(colab);
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.PUT)
	public Collaborator update(@PathVariable("id") Integer id, @RequestBody @Valid Collaborator colab) {
		return collabService.saveCollaborator(colab);
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.DELETE)
	public ResponseEntity<Boolean> deletarColaborador(@PathVariable("id") Integer id){
		collabService.removeCollaborator(id);
		return new ResponseEntity<Boolean>(Boolean.TRUE, HttpStatus.OK);
	}
}