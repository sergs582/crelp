package com.idealabs.crelpweb.dao;

import org.springframework.data.repository.CrudRepository;

import com.idealabs.crelpweb.entities.Idea;

public interface IdeaDao extends CrudRepository<Idea, Integer>{

}
