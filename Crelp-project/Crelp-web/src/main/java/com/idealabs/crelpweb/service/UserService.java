package com.idealabs.crelpweb.service;

import com.idealabs.crelpweb.entities.User;

public interface UserService {
	
	Iterable<User> getAllUsers();

	User getUserById(Integer id);
	
	User getUserByLogin(String login);

	void saveUser(User user);

	void deleteUser(Integer id);

}
