package com.sample.test;

import org.junit.Test;

import com.sample.model.LoginModel;

import junit.framework.TestCase;

public class TestLogin extends TestCase {
	
	/*@Test
	public void NullLoginForm(){
		LoginModel loginModel = new LoginModel();
		String fail="Failure";
		String name="  ";
		String dob="  ";
		assertEquals("Null values are sent into the login form",fail,loginModel.verifyNullForm(name,dob));
	}*/
	
	@Test
	public void NotNullLoginForm(){
		String pass="Success";
		String name="Krishna";
		String dob="082684";
		assertEquals("Null values are sent into the login form",pass,LoginModel.verifyNullForm(name,dob));
	}

}
