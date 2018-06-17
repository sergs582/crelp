package com.idealabs.crelpweb.service;

import com.idealabs.crelpweb.entities.Role;

public interface RoleService {
	
	
	Iterable<Role> getallRoles();
	
	Role getRoleById(Integer id);

}
