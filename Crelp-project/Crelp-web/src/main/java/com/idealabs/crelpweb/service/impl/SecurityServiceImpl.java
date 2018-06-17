package com.idealabs.crelpweb.service.impl;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.idealabs.crelpweb.entities.security.LoggedAccountBean;
import com.idealabs.crelpweb.service.SecurityService;
import com.idealabs.crelpweb.service.constant.Roles;


@Service
@Transactional
public class SecurityServiceImpl implements SecurityService {

	@Override
	public Integer getLoggedAccountId() {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (auth == null) {
        	return null;
        }
        Object principal = auth.getPrincipal();
        LoggedAccountBean bean = (LoggedAccountBean)principal;
		return bean.getId();
		
	}

	@Override
	public Roles getLoggedRole() {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (auth == null) {
        	return null;
        }
        Object principal = auth.getPrincipal();
        LoggedAccountBean bean = (LoggedAccountBean)principal;
		return Roles.getRoleById(bean.getRole());
	}

}
