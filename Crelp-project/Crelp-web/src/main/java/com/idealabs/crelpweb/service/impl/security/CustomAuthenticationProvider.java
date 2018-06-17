package com.idealabs.crelpweb.service.impl.security;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.LockedException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;

import com.idealabs.crelpweb.dao.RoleDao;
import com.idealabs.crelpweb.dao.UserDao;
import com.idealabs.crelpweb.entities.Role;
import com.idealabs.crelpweb.entities.User;
import com.idealabs.crelpweb.entities.security.GrantedAuthorityBean;
import com.idealabs.crelpweb.entities.security.LoggedAccountBean;
import com.idealabs.crelpweb.service.UserService;

public class CustomAuthenticationProvider implements AuthenticationProvider {

	@Autowired
    private UserDao userService;
	
	
	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		 LoggedAccountBean loggedAccount = createLoggedAccount(authentication);
	        String password = (String) authentication.getCredentials();
	      
	 
	        if (!password.equals(loggedAccount.getPassword())) {
	            throw new BadCredentialsException("Wrong password!");
	        }
	 
	        if (!loggedAccount.isAccountNonLocked()) {
	            throw new LockedException("User Account is locked!", new Exception());
	        }
	 
	        return new UsernamePasswordAuthenticationToken(loggedAccount, password, loggedAccount.getAuthorities());
		
		
	}

	@Override
	public boolean supports(Class<?> arg0) {
				return true;
	}
	
	 private LoggedAccountBean createLoggedAccount(Authentication authentication)throws AuthenticationException{
		
		 try {
			 
		 
		 String userName = authentication.getName();
		 
	        User user = userService.findByLogin(userName);
	        int roles = user.getRole();
	 
	        Collection<GrantedAuthorityBean> authorities = getUserAuthorities(roles);
	 
	        LoggedAccountBean loggedAccount = new LoggedAccountBean(user, authorities);
	 
	        return loggedAccount;
		 }
		 catch(NullPointerException e){
			 throw new BadCredentialsException("Wrong login!");
		 }
		 
		 
		 
	    }
	 
	 private  Collection<GrantedAuthorityBean> getUserAuthorities(int role) {
	        Collection<GrantedAuthorityBean> authorities = new ArrayList<>();
	 
	        
	       String roles = String.valueOf(role);
	        
	            GrantedAuthorityBean bean = new GrantedAuthorityBean(roles);
	            authorities.add(bean);
	        
	 
	        return authorities;
	    }
	 
	 
	 
	 
	 

}
