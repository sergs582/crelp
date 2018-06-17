package com.idealabs.crelpweb.entities.security;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.idealabs.crelpweb.entities.User;

public class LoggedAccountBean implements UserDetails {
	
	private static final long serialVersionUID = 1L;

	private User user;

	
	 private Collection<GrantedAuthorityBean> authorities;
	 
	 public LoggedAccountBean(User user, Collection<GrantedAuthorityBean> authorities) {
	        this.user = user;
	        this.authorities = authorities;
	    }

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
				return  authorities;
	}

	public Integer getRole() {
		return user.getRole();
	}

	@Override
	public String getUsername() {
				return user.getLogin();
	}
	
	
	public Integer getId() {
		return user.getId();
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		
		if(user.getStatus()==0) {
			return true;
		} else {
			return false;
		}
		
				
	}

	@Override
	public String getPassword() {
		return user.getPassword();
	}

}
