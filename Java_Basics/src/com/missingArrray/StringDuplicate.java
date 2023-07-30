package com.missingArrray;

public class StringDuplicate {
	
	public static void main(String[] args) {
		
		
		String S ="Venkatesh";
		int length = S.length();
		System.out.println("Length:" +length);
		char[] ch = S.toCharArray();
		System.out.println("String to check:" +S);
		for (int i = 0; i < length; i++) {
					
			for (int j = i+1; j < length; j++) {
				
		
				if (ch[i]==ch[j]) {
					
					System.out.println("Duplicate charecter are :" + ch[j]);
					break;
				}
				
				
			}
			
		}
	
	
		
	}

}
