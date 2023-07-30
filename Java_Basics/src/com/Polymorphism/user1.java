package com.Polymorphism;

public class user1 extends Signup{
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
		
		user1 u1 =new user1();
		
		u1.registrationform("venkatesh"," T");
		u1.registrationform(123456789L);
		u1.registrationform("abc@gmail.com");
		u1.registrationform("12/12/1994",'m');
		
		
	}
	
	
	
}
