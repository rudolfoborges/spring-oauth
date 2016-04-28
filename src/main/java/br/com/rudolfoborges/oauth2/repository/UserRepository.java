package br.com.rudolfoborges.oauth2.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.rudolfoborges.oauth2.model.User;

@Component
public class UserRepository {

	private final UserDB DB;
	
	@Autowired
	public UserRepository(UserDB userDB){
		this.DB = userDB;
	}
	
	public User find(String username){
		User user = null;
		for (User u : DB) {
			if(u.getUsername().equalsIgnoreCase(username)) {
				user = u;
			}
		}
		return user; 
	}
		
}
