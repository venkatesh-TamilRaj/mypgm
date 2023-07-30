package com.Polymorphism;

public class Method_Overloading {
	
	private void passangerDetails(String passangerName,String trainName) {
		System.out.println("RailWay Booking");
		System.out.println("-------------------");
		System.out.print("Passanger Name & Train Name :  ");System.out.println(passangerName+"  "+trainName);
		// TODO Auto-generated method stub

		}

	private void passangerDetails(int age) {
		// TODO Auto-generated method stub
System.out.print("Age:  ");System.out.println(age);
	}
	
	private void passangerDetails(String desti) {
		// TODO Auto-generated method stub
System.out.print("Destination:");System.out.println(desti);
	}
	
private void passangerDetails(double fare) {
	// TODO Auto-generated method stub
System.out.print("Fare :");System.out.println(fare);
}
private void passangerDetails(long adharNo) {
	
	System.out.print("Adhaar number : ");System.out.println(adharNo);
	// TODO Auto-generated method stub

}
private void passangerDetails(String emailId,int bookingId) {
	// TODO Auto-generated method stub

	System.out.print("Email:");System.out.println(emailId);
	System.out.print("BookingID:");System.out.println(bookingId);
}
public static void main(String[] args) {

		Method_Overloading m = new Method_Overloading();
			
		m.passangerDetails("Venkat","Kovai Express");
		m.passangerDetails(25);
		m.passangerDetails("coimbature");
	    m.passangerDetails(350.23	);
	    m.passangerDetails(1234567L);
	    m.passangerDetails("abc@gmail.com",124);
	}
}

