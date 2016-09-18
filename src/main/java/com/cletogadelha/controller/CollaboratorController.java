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
@RequestMapping("/rest/colaborador")
public class CollaboratorController {
	
	@Autowired
	private CollaboratorService colabService;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public Collaborator getDetalhesColaborador(@PathVariable("id") Integer id) {
		return colabService.getDetalhesCollaborator(id);
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Collaborator> getListaColaboradores() {
		return colabService.getListaCollaborators();
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public Collaborator salvarColaborador(@RequestBody @Valid Collaborator colab){
		return colabService.salvarCollaborator(colab);
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.PUT)
	public Collaborator update(@PathVariable("id") Integer id, @RequestBody @Valid Collaborator colab) {
		return colabService.salvarCollaborator(colab);
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.DELETE)
	public ResponseEntity<Boolean> deletarColaborador(@PathVariable("id") Integer id){
		colabService.removeCollaborator(id);
		return new ResponseEntity<Boolean>(Boolean.TRUE, HttpStatus.OK);
	}
}