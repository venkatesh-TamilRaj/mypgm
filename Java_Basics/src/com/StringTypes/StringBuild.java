package com.StringTypes;

public class StringBuild {
	
	public static void main(String[] args) {
		
		
		
		StringBuilder S1=new StringBuilder("Computer"); 
		StringBuilder S2=new StringBuilder("Computer");  
		System.out.println(System.identityHashCode(S1));
		System.out.println(System.identityHashCode(S2));
		S2.append(S1);
		System.out.println(S2);
		System.out.println(System.identityHashCode(S2));
		
	}

}
