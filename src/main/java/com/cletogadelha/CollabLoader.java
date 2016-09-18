package com.cletogadelha;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.cletogadelha.entity.Collaborator;
import com.cletogadelha.entity.Competency;
import com.cletogadelha.entity.Contact;
import com.cletogadelha.repository.CollaboratorRepository;

@Component
public class CollabLoader implements ApplicationListener<ContextRefreshedEvent> {
 
    private CollaboratorRepository colabRepository;
 
    @Autowired
    public void setProductRepository(CollaboratorRepository colabRepository) {
        this.colabRepository = colabRepository;
    }
 
    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
		
		Collaborator collab = new Collaborator("Jack Bauer", "Software Developer", "Software Factory");
		
		Set<Competency> compList = new HashSet<>();
		Competency comp = new Competency();
		comp.setDescription("MEAN");
		compList.add(comp);
		
		Set<Contact> contList = new HashSet<>();
		Contact contato = new Contact();
		contato.setType("Facebook");
		contato.setContact("facebook.com.br/jackBauer");
		contList.add(contato);
		
		collab.setContactList(contList);
		collab.setCompetencies(compList);
		
		colabRepository.save(collab);
    }
}
