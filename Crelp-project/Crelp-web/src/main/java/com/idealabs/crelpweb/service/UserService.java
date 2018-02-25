package com.idealabs.crelpweb.service;

import com.idealabs.crelpweb.entities.User;

public interface UserService {
	
	Iterable<User> getAllUsers();

	User getUserById(Integer id);

	void saveUser(User user);

	void deleteUser(Integer id);

}
