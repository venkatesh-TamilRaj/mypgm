package com.Polymorphism;

public class Signup {

	public void registrationform(String fname ,String lname) {
		System.out.println(fname+ " "+lname);	}
	
	 public void registrationform(String email) {
			  System.out.println(email);
	}
 
	  public void registrationform(long mobileNo) {
 System.out.println(mobileNo);
	}
	
public void registrationform(String dob,char gender) {
 System.out.println(dob+ " "+gender);
}


}
