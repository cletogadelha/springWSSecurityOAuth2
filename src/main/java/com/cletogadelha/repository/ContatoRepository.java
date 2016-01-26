package com.cletogadelha.repository;

import org.springframework.data.repository.CrudRepository;

import com.cletogadelha.entity.Contato;

public interface ContatoRepository extends CrudRepository<Contato, Integer> {
}