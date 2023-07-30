package com.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
public class Map_Type {
	
	public static void main(String[] args) {
	Map <Integer,Object> m = new HashMap<Integer,Object>();
		m.put(0,"python");
		m.put(1,"java");
		m.put(2,"Selenium");
		m.put(3,100);
		m.put(4, 10.5);
		
		System.out.println(m);
		int size = m.size();
		System.out.println(size);
		
		Object object = m.get(1);
		System.out.println(object);
        Set<Integer> keySet = m.keySet();	
        System.out.println(keySet);
        Collection<Object> values = m.values();
        System.out.println(values);
        boolean containsKey = m.containsKey(100);
        System.out.println(containsKey);
        boolean containsValue = m.containsValue("java");
        System.out.println(containsValue);
    	Set<Entry<Integer, Object>> entrySet = m.entrySet();
       	  for (Entry<Integer, Object> entry : entrySet) {
			System.out.println(entry);
		}
       	 
   		
   System.out.println("--------------------------------------------------");
  
	System.out.println("Linked Hash map ");
	
	Map <Integer,Object> m1 = new LinkedHashMap<Integer,Object>();
	
	m1.put(0,"c");
	m1.put(1,"c++");
	m1.put(2,"chrome");
	m1.put(3,200);
	m1.put(4, 20.5);
	
	System.out.println(m1);
	int size1 = m1.size();
	System.out.println(size1);
	
	Object object1 = m1.get(1);
	System.out.println(object1);
    Set<Integer> keySet1 = m1.keySet();	
    System.out.println(keySet1);
    Collection<Object> values1 = m1.values();
    System.out.println(values1);
   	Set<Entry<Integer, Object>> entrySet2 = m1.entrySet();
   	 for (Entry<Integer, Object> entry : entrySet2) {
   		 
   		 System.out.println(entry);
		
	}
		
	m1.remove(3);//remove
	System.out.println(m1);
		
	System.out.println("--------------------------------------------------");
	  
	System.out.println("Hash Table ");
    Map <Integer,Object> m2 = new Hashtable<Integer,Object>();
	
    m2.put(0,"lap");
	m2.put(1,"Pc");
	m2.put(2,"mobile");
	m2.put(3,300);
	m2.put(4, 40.5);
	
	System.out.println(m2);
	int size11 = m2.size();
	System.out.println(size11);
	
	Object object11 = m2.get(1);
	System.out.println(object11);
    Set<Integer> keySet11 = m2.keySet();	
    System.out.println(keySet11);
    Collection<Object> values11 = m2.values();
    System.out.println(values11);
   	Set<Entry<Integer, Object>> entrySet21 = m2.entrySet();
   	 for (Entry<Integer, Object> entry : entrySet21) {
   		 
   		 System.out.println(entry);
		
	}
		
		}
	




}








