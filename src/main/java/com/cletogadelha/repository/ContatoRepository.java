package com.cletogadelha.repository;

import org.springframework.data.repository.CrudRepository;

import com.cletogadelha.entity.Contact;

public interface ContatoRepository extends CrudRepository<Contact, Integer> {
}