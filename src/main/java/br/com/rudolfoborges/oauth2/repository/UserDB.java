package br.com.rudolfoborges.oauth2.repository;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import br.com.rudolfoborges.oauth2.model.Role;
import br.com.rudolfoborges.oauth2.model.User;

@Component
public class UserDB extends ArrayList<User> {

	private static final long serialVersionUID = 1L;

	private static UserDB instance; 
	
	private UserDB(){}
	
	@Bean
	public UserDB getInstance(){
		if(instance == null){
			instance = new UserDB();
			
			User user1 = new User("rudolfoborges", "1234");
			user1.getRoles().add(new Role("ADMIN"));
			
			User user2 = new User("fulano", "xpto");
			user1.getRoles().add(new Role("MEMBER"));
			
			addAll(Arrays.asList(user1, user2));
			
		}
		return instance;
	}
	
}
