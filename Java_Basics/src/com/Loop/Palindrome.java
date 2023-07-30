package com.Loop;
import java.util.Scanner;
public class Palindrome {
	
	public static void main(String[] args) {
	int r=0;
		int ans=0;
		Scanner Sc =new Scanner(System.in);
		System.out.println("Enter the number to check palindrome or not");
		int n=Sc.nextInt();
		int a = n;
		while(n>0) {
			r=n%10;
			ans=(ans*10)+r;
			n=n/10;
		}
		if (a==ans) {
				System.out.println("palindrome");
			}
		else
		{
			
			System.out.println("not palindrome");
		}
		
		Sc.close();
	}

}
