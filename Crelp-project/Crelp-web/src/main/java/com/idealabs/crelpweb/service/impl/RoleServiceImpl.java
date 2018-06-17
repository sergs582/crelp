package com.idealabs.crelpweb.service.impl;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.idealabs.crelpweb.dao.RoleDao;
import com.idealabs.crelpweb.entities.Role;
import com.idealabs.crelpweb.service.RoleService;

@Service
@Transactional
public class RoleServiceImpl implements RoleService{

	
	@Autowired
	private RoleDao roledao;
	
	
	
	@Override
	public Iterable<Role> getallRoles() {
		
		return roledao.findAll();
	}

	@Override
	public Role getRoleById(Integer id) {
		// TODO Auto-generated method stub
		return roledao.findById(id).get();
	}

	
	
	
	
}
