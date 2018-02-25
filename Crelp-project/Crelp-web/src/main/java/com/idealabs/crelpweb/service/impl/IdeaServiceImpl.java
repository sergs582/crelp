package com.idealabs.crelpweb.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idealabs.crelpweb.dao.IdeaDao;
import com.idealabs.crelpweb.entities.Idea;
import com.idealabs.crelpweb.service.IdeaService;

@Service
@Transactional
public class IdeaServiceImpl implements IdeaService{
	
	@Autowired
    private IdeaDao ideaDao;


	@Override
	public Iterable<Idea> getAllUsers() {
		return ideaDao.findAll();
	}

	@Override
	public Idea getIdeaById(Integer id) {
		
		return ideaDao.findById(id).get();
	}

	@Override
	public void saveIdea(Idea idea) {
		ideaDao.save(idea);		
	}

	@Override
	public void deleteIdea(Integer id) {
		ideaDao.deleteById(id);
		
	}

}
