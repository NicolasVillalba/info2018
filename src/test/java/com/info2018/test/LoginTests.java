package com.info2018.test;

import org.junit.Before;
import org.junit.Test;

import com.info2018.elements.Login;
import com.info2018.exceptions.InvalidPasswordException;
import com.info2018.exceptions.InvalidUserException;
import static org.junit.Assert.*;

import org.junit.After;

public class LoginTests {
	
	private Login loginObject;
	
	@Before
	public void setUp() {
		this.loginObject = new Login("Pedro", "dsdsdsdsds");
	}
	
	@Test
	public void paswordHappyPathTest() {
		assertTrue(this.loginObject.validate("Pedro", "dsdsdsdsds"));
	}
	
	@Test(expected = InvalidUserException.class)
	public void paswordInvalidDataTest() {
		assertTrue(this.loginObject.validate("Pedsro", "dsdsdsdsds"));
	}
	
	@Test(expected = InvalidPasswordException.class)
	public void paswordInvalidDataForPasswdTest() {
		assertTrue(this.loginObject.validate("Pedro", "ddsdkjds"));
	}
	
	@After
	public void tearDown() {
		this.loginObject = null;
	}

}
