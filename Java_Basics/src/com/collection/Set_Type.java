package com.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Set_Type {
	
	public static void main(String[] args) {
		
		Set <Object> obj = new HashSet <Object>();
		
		obj.add("Java");
		obj.add("Welcome");
		obj.add("Selenium");
		obj.add("100");
	    obj.add("10.5");
		int size = obj.size();
		System.out.println(size);
     	boolean contains = obj.contains("100");
		System.out.println(contains);
		
		System.out.println(obj);
		
		Set <Object> obj1 = new TreeSet <Object>();

		obj1.add("Pgm");
		obj1.add("Html");
		obj1.add("Css");
		
		obj1.addAll(obj);
		System.out.println(obj1);
		
		
		
	}

}
