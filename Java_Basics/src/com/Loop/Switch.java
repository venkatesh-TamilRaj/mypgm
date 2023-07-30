package com.Loop;
import java.util.Scanner;
public class Switch {
	public static void main(String[] args) {
		System.out.println("Enter your Account Type");
		System.out.println("1.Current");
		System.out.println("2.Saving");
		Scanner Sc = new Scanner(System.in);
		int i =Sc.nextInt();
		switch (i) {
		case 1:
				System.out.println("Current");
		
			break;
         case 2:
			
			System.out.println("saving");
			
			break;	

		default:
			
			System.out.println("wrong option");
			break;
		}
		
		Sc.close();
	}

}
