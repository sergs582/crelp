package com.idealabs.crelpweb.service;

import com.idealabs.crelpweb.service.constant.Roles;

public interface SecurityService {

	Integer getLoggedAccountId();
	
	Roles getLoggedRole();
	
}
