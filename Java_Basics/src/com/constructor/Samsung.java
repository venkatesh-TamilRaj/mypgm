package com.constructor;

public class Samsung {
	
	public Samsung(String brand) {
		// TODO Auto-generated method stub

		System.out.println("samsung");
	}
	
public Samsung(String modelName,int modelNumber) {
	
	System.out.println((modelName+" "+modelNumber));
	// TODO Auto-generated constructor stub
}

public  Samsung(String variant,long year,String displayType) {
	// TODO Auto-generated method stub
	
	System.out.println(variant+ " " +year+ " " +displayType);
	
}
public static void main(String[] venkat) {
	
	Samsung s =new Samsung("SAMSUNG");
	Samsung s1= new Samsung("galaxy",101);
	Samsung s2= new Samsung("blue",2022L,"Touch");
			
	
			
}	
}

