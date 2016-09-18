package com.cletogadelha.repository;

import org.springframework.data.repository.CrudRepository;

import com.cletogadelha.entity.User;

public interface UserRepository extends CrudRepository<User, Long> {

	User findByLogin(String login);
}
