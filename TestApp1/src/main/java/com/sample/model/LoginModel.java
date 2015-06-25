package com.sample.model;

public class LoginModel {
	
	public String verifyFormDetails(String name,String DOB){
		
		return null;
	}

	public static String verifyNullForm(String name, String dob) {
		if ((name.trim().length()>0) && (dob.trim().length()>0)){
			return "Success";
		}else{
			return "Failure";
		}
	}

}
