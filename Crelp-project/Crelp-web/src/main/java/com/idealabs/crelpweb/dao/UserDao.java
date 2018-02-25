package com.idealabs.crelpweb.dao;



import org.springframework.data.repository.CrudRepository;

import com.idealabs.crelpweb.entities.User;



public interface UserDao extends CrudRepository<User, Integer>{

	User findByLogin(String login);
}
