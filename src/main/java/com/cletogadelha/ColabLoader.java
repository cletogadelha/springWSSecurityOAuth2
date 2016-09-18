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
import com.cletogadelha.repository.ColaboradorRepository;

@Component
public class ColabLoader implements ApplicationListener<ContextRefreshedEvent> {
 
    private ColaboradorRepository colabRepository;
 
    @Autowired
    public void setProductRepository(ColaboradorRepository colabRepository) {
        this.colabRepository = colabRepository;
    }
 
    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
		
		Collaborator colab = new Collaborator("Jack Bauer", "Desenvolvedor de Software", "Fábrica de Software");
		
		Set<Competency> listaComp = new HashSet<>();
		Competency comp = new Competency();
		comp.setDescription("MEAN");
		comp.setCollaborator(colab);
		listaComp.add(comp);
		
		Set<Contact> listaCont = new HashSet<>();
		Contact contato = new Contact();
		contato.setType("Facebook");
		contato.setContact("facebook.com.br/jackBauer");
		contato.setCollaborator(colab);
		listaCont.add(contato);
		
		colab.setContactList(listaCont);
		colab.setCompetencies(listaComp);
		
		colabRepository.save(colab);
    }
}
