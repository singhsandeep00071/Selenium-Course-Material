package com.test;

public class StringOperations {
	public static void main(String[] args) {

		String n = "Hello Welcome World";
//		String s = n.toUpperCase();
		String[] abc = n.split(" ");

		// to print all characters
		for (int i = 0; i < n.length(); i++) {
			System.out.println(n.charAt(i));
		}
		
		// to print all characters in reverse order
		for (int i = n.length() - 1; i >= 0; i--) {
			System.out.println(n.charAt(i));
		}

//		System.out.println(abc[0]);
//		System.out.println(abc[1].trim());

		// other method
		
		String str = "Geeks", nstr = "";
		char ch;

		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i); // extracts each character
			nstr = ch + nstr;
			System.out.println("Reversed word within loop: " + nstr);
			// adds each character in front of the existing string
		}
		System.out.println("Reversed word end result: " + nstr);
	}

}
