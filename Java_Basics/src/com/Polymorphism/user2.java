package com.Polymorphism;

public class user2 extends Signup {
	@Override
	public void registrationform(String fname, String lname) {
		// TODO Auto-generated method stub
		super.registrationform(fname, lname);
	}
	
	@Override
	public void registrationform(long mobileNo) {
		// TODO Auto-generated method stub
		super.registrationform(mobileNo);
	}
	
	@Override
	public void registrationform(String email) {
		// TODO Auto-generated method stub
		super.registrationform(email);
	}
	@Override
	public void registrationform(String dob, char gender) {
		// TODO Auto-generated method stub
		super.registrationform(dob, gender);
	}
	
public static void main(String[] args) {
	
	user2 u2 = new user2();
	
	u2.registrationform("Roja", "R");
	u2.registrationform(994787874L);
	u2.registrationform("123@abc.com");
	u2.registrationform("12/12/1997",'F');
	
}
}
