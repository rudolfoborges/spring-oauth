package br.com.rudolfoborges.oauth2.model;

import org.springframework.security.core.GrantedAuthority;

public class Role implements GrantedAuthority {
	
	private static final long serialVersionUID = 1L;
	
	private final String name;

	public Role(final String name){
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	@Override
	public String getAuthority() {
		return name;
	}

}
