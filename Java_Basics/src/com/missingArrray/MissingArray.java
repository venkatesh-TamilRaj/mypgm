package com.missingArrray;



public class MissingArray {
	
/*	private void missingNumber(int[] number) {
		
		
		int n = number.length;
		int s=0;
		
		for (int i = 0; i < n; i++) {
			
			s =s+number[i];
			
		}
		// TODO Auto-generated method stub
		return n*(n+1)/2;  
	}*/
	
	
	public static void main(String[] args) {
		
		
		int a[] = {0,1,2,3,4,5,6,8,9,10};
	
		int n=a.length;
		
		int s=0;
		
		for (int i = 0; i < a.length; i++) {
			
			s= s+a[i];
		
		
		}
		//System.out.println(s);
		
		int s1=0;
		for (int j = 1; j <=10; j++) {
			
			
			s1=s1+j;
	
			
		}
		//System.out.println(s1);
		
		int miss  =s1-s;
		System.out.println("Missing number ina Array is :" +miss);
		
	}
	
	
}
