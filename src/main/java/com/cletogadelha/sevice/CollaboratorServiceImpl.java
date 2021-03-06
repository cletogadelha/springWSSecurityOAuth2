package com.cletogadelha.sevice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cletogadelha.entity.Collaborator;
import com.cletogadelha.repository.CollaboratorRepository;

@Component
public class CollaboratorServiceImpl implements CollaboratorService {
	
	private final CollaboratorRepository repository;
	
	@Autowired
	public CollaboratorServiceImpl(CollaboratorRepository repository){
		this.repository = repository;
	}
	
	@Override
	public Collaborator getDetails(Integer id){
		return (Collaborator) repository.findOne(id);
	}

	@Override
	public List<Collaborator> getCollaboratorsList() {
		return (List<Collaborator>)repository.findAll();
	}

	@Override
	public Collaborator saveCollaborator(Collaborator colab) {
		return repository.save(colab);
	}

	@Override
	public void removeCollaborator(Integer id) {
		repository.delete(id);
	}
}
