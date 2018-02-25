package com.idealabs.crelpweb.service.impl;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.idealabs.crelpweb.dao.UserDao;
import com.idealabs.crelpweb.entities.User;
import com.idealabs.crelpweb.service.UserService;


@Service
@Transactional
public class UserServiceImpl implements UserService{
	
	@Autowired
    private UserDao userDao;

	@Override
	public Iterable<User> getAllUsers() {
		return userDao.findAll();
	}

	@Override
	public User getUserById(Integer id) {

		
		return userDao.findById(id).get();
	}

	@Override
	public void saveUser(User user) {
	userDao.save(user);
	}

	@Override
	public void deleteUser(Integer id) {
		userDao.deleteById(id);
		
	}

}
