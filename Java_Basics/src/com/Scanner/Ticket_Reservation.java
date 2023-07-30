package com.Scanner;
import java.util.Scanner;
public class Ticket_Reservation {
	public static void main(String[] args) {
	Scanner Sc = new Scanner(System.in);
	System.out.println("--------------------------------------");
	System.out.println("Welocome to Bus Ticket Booking Online");
	System.out.println("--------------------------------------");
	System.out.println("Please enter the passanger Name:");
	String PsgName =Sc.nextLine();
	System.out.println(PsgName);
	System.out.println("Enter the passanger Age:");
    String PsgAge = Sc.nextLine();
    System.out.println(PsgAge);
    System.out.println("Gender:");
    String PsgGen = Sc.nextLine();
    System.out.println(PsgGen);
    System.out.println("From:");
    String from = Sc.nextLine();
    System.out.println(from);
    System.out.println("Destinaition:");
    String Desti = Sc.nextLine();
    System.out.println(Desti);
	System.out.println("Fare:");
	String Fare = Sc.nextLine();
    System.out.println(Fare);	
    System.out.println("Ac or Non Ac");
    String Ac = Sc.nextLine();
    System.out.println(Ac);
    System.out.println("Seater or Sleeper");
    String Seat = Sc.nextLine();
    System.out.println(Seat);  
    System.out.println("Seat No");
    String SeatNo = Sc.nextLine();
    System.out.println(SeatNo);
    Sc.close();
    
	}





}