package br.com.rudolfoborges.oauth2.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import br.com.rudolfoborges.oauth2.model.Role;
import br.com.rudolfoborges.oauth2.model.User;

@Component
public class UserRepository {

	private static final List<User> DB = new ArrayList<User>();
	
	static {
		User user1 = new User("rudolfoborges", "1234");
		user1.getRoles().add(new Role("ADMIN"));
		
		User user2 = new User("fulano", "xpto");
		user1.getRoles().add(new Role("MEMBER"));
		
		DB.addAll(Arrays.asList(user1, user2));
	}
	
	public User find(String username){
		User user = null;
		for (User u : DB) {
			if(u.getUsername().equalsIgnoreCase(username)) user = u;
		}
		return user; 
	}
		
}
