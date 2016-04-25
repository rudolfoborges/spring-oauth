package br.com.rudolfoborges.oauth2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.rudolfoborges.oauth2.model.User;

@RestController
@RequestMapping(path="user")
public class UserController {

	@RequestMapping(method=RequestMethod.GET)
	public User get(){
		return null;
	}
	
}
