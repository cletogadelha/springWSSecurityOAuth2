package com.cletogadelha.sevice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cletogadelha.entity.Collaborator;
import com.cletogadelha.repository.ColaboradorRepository;

@Component
public class CollaboratorServiceImpl implements CollaboratorService {
	
	private final ColaboradorRepository repository;
	
	@Autowired
	public CollaboratorServiceImpl(ColaboradorRepository repository){
		this.repository = repository;
	}
	
	public Collaborator getDetalhesCollaborator(Integer id){
		return (Collaborator) repository.findOne(id);
	}

	@Override
	public List<Collaborator> getListaCollaborators() {
		return (List<Collaborator>)repository.findAll();
	}

	@Override
	public Collaborator salvarCollaborator(Collaborator colab) {
		return repository.save(colab);
	}

	@Override
	public void removeCollaborator(Integer id) {
		repository.delete(id);
	}
}
