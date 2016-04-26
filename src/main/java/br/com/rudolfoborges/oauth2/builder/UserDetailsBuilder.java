package br.com.rudolfoborges.oauth2.builder;

import org.springframework.security.core.userdetails.UserDetails;

import br.com.rudolfoborges.oauth2.exception.UserNotFoundException;
import br.com.rudolfoborges.oauth2.model.User;

public class UserDetailsBuilder {
	
	public static UserDetails build(final User user){
		
		if(user == null){
			throw new UserNotFoundException();
		}
		
		return new UserDetailsProxy(user);
	}
	
}
