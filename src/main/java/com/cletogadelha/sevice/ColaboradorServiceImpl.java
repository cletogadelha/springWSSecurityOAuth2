package com.cletogadelha.sevice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cletogadelha.entity.Colaborador;
import com.cletogadelha.repository.ColaboradorRepository;

@Component
public class ColaboradorServiceImpl implements ColaboradorService {
	
	private final ColaboradorRepository repository;
	
	@Autowired
	public ColaboradorServiceImpl(ColaboradorRepository repository){
		this.repository = repository;
	}
	
	public Colaborador getDetalhesColaborador(Integer id){
		return (Colaborador) repository.findOne(id);
	}

	@Override
	public List<Colaborador> getListaColaboradores() {
		return (List<Colaborador>)repository.findAll();
	}

	@Override
	public Colaborador salvarColaborador(Colaborador colab) {
		return repository.save(colab);
	}

	@Override
	public void removeColaborador(Integer id) {
		repository.delete(id);
	}
}
