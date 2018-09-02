package com.info2018.elements;

import com.info2018.exceptions.InvalidPasswordException;
import com.info2018.exceptions.InvalidUserException;

public class Login {
	private final String user;
	private final String password;
	
	public Login(String user, String passwd) {
		this.user = user;
		this.password = passwd;
	}

	public Boolean validate(String user, String passwd) {
		if(!this.user.equals(user)) {
			throw new InvalidUserException("Invalid User");
		}
		if(!this.password.equals(passwd)) {
			throw new InvalidPasswordException("Invalid password");
		}
		
		return true;
	}

}
