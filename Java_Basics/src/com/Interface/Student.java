package com.Interface;

public class Student implements school {

	@Override
	public void donater() {
		// TODO Auto-generated method stub
	System.out.println("ganesh");	
	}

	@Override
	public void staffSalary() {
		// TODO Auto-generated method stub
		System.out.println("30000");
		
	}

	@Override
	public void membername() {
		// TODO Auto-generated method stub
		System.out.println("Raja");
	}

	public static void main(String[] args) {
		Student s =new Student();
		
		s.donater();
		s.staffSalary();
		s.membername();
	}
}
