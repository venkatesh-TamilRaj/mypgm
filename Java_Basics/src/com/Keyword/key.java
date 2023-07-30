package com.Keyword;

public class key extends Static{
	
  int a=100;
  int b=200;
	private void mul() {
		
		int a=76;
		int b=56;
		int c =a*b;
		// TODO Auto-generated method stub
		System.out.println(this.a);
		System.out.println(this.b);
		System.out.println(super.a);
		System.out.println(super.b);
		System.out.println(b);
		System.out.println(a);
		System.out.println("ans:"+c);
		super.sub();
	}
	public static void main(String[] args) {
		
		key k =new key();
		k.sub();	
		k.mul();	


	
		
	}

}
