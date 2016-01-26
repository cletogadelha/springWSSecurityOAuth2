package com.cletogadelha.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.cletogadelha.entity.Colaborador;
import com.cletogadelha.entity.Competencia;
import com.cletogadelha.entity.Contato;
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
		
		Colaborador colab = new Colaborador("Jack Bauer", "Desenvolvedor de Software", "Fábrica de Software");
		
//		List<Competencia> listaComp = new ArrayList<>();
//		Competencia comp = new Competencia();
//		comp.setDescricao("MEAN");
//		listaComp.add(comp);
//		
//		List<Contato> listaCont = new ArrayList<>();
//		Contato contato = new Contato();
//		contato.setTipo("Facebook");
//		contato.setContato("facebook.com.br/jackBauer");
//		contato.setColaborador(colab);
//		listaCont.add(contato);
//		
//		colab.setListaContatos(listaCont);
//		colab.setCompetencias(listaComp);
		
		colabRepository.save(colab);
    	
    }
}
