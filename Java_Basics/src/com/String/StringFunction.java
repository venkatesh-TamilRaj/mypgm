package com.String;
public class StringFunction {
	public static void main(String[] args) {
		String a= "";
		String s= "hai";
		String S1 ="Welcome Java";
		int length = s.length();
		System.out.println(length);
		boolean equals = S1.equals(s);
		System.out.println(equals);
		boolean equalsIgnoreCase = s.equalsIgnoreCase(S1);
		System.out.println(equalsIgnoreCase);
		String upperCase = s.toUpperCase();
		System.out.println(upperCase);
		boolean startsWith = s.startsWith("a");
		System.out.println(startsWith);
        boolean endsWith = s.endsWith("i");
        System.out.println(endsWith);
        boolean contains = s.contains("a");
        System.out.println(contains);
        int indexOf = s.indexOf("a");
        System.out.println(indexOf);
        int lastIndexOf = S1.lastIndexOf("o");
        System.out.println(lastIndexOf);
        char charAt = S1.charAt(3);
        System.out.println(charAt);
        String replace = S1.replace("e", "w");
        System.out.println(replace);
        String substring = S1.substring(5).trim();
        System.out.println(substring);
        boolean empty = a.isEmpty();
        System.out.println(empty);
		int compareTo = s.compareTo(S1);
		System.out.println(compareTo);
		String[] split = S1.split(" ");
		for (String string : split) {
		System.out.print(string);
		}
        
        
	}

}
