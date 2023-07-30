package com.Loop;
import java.util.Scanner;
public class ifelseLadder {
	public static void main(String[] args) {

		System.out.println("=============================");
		System.out.println("Enter the Age to Find Category");
	    System.out.println("==============================");
	    Scanner Sc = new Scanner(System.in);

		int age = Sc.nextInt();
	    if (age <= 6) {
 	    	System.out.println("Kids");
	}
	    else if (age>7 && age <=18) {
	    	System.out.println("Boy");
			
		}
	    else if (age>19 && age <50) {
	    	
	    	System.out.println("Citizen");
			
		}
	    else if (age >=50 && age <=100) {
	    	
	    	System.out.println("Senior Citizen");
			
		}
	    else {
			System.out.println("Invalid");
		}
    
	    Sc.close();
	}

}
