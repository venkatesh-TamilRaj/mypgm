package com.parametertest;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter_Test {
	
	
	@Test
	@Parameters({"userName","Password"})
	private void credentialData(String uname, String pass) {
		// TODO Auto-generated method stub

		System.out.println("usename " + uname);
		System.out.println("password" + pass);
		
	}
	

}
