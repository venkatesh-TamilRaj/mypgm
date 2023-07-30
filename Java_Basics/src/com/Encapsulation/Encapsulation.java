package com.Encapsulation;

public class Encapsulation {
	
	private void employeeName() {
		
		System.out.println("venkat");
	}
	
	public void employeeAge() {
		// TODO Auto-generated method stub
		
		System.out.println(29);

	}
	
	protected void employeeId() {
		// TODO Auto-generated method stub
		
		System.out.println(1234);
		
	}
	
	 void designation() {
		// TODO Auto-generated method stub
		
		System.out.println("associate");
	}
	
	private void location() {
		// TODO Auto-generated method stub
		
		System.out.println("chennai");
	}
	
	
	public static void main(String[] args) {
	
	
		Encapsulation e=new Encapsulation();
		
		e.employeeName();
        e.employeeAge();
        e.employeeId();
        e.designation();
		e.location();
		
	}

	
}





