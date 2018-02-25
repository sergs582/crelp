package com.idealabs.crelpweb.service;

import com.idealabs.crelpweb.entities.Idea;


public interface IdeaService {
	
	
	Iterable<Idea> getAllUsers();

	Idea getIdeaById(Integer id);

	void saveIdea(Idea idea);

	void deleteIdea(Integer id);

}
