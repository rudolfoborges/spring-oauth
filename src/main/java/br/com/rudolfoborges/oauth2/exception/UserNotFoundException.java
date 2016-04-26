package br.com.rudolfoborges.oauth2.exception;

public class UserNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public UserNotFoundException(){
		super("User not found exception");
	}
	
}
