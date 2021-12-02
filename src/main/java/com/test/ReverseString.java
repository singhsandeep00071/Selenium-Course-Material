package com.test;

public class ReverseString {

	public static void main(String[] args) {
		
		String input = "Welcome Hello World";

		// StringBuilder is a input java class
		StringBuilder newInput = new StringBuilder();
		// append a string into StringBuilder newInput append method is used to convert
		// normal string to StringBuilder method
		newInput.append(input);
		// reverse StringBuilder newInput
		newInput.reverse();
		System.out.println(newInput);
		
		ReverseStringMethod();

	}
	
	// Reverse String using string buffer message
	public static void ReverseStringMethod() {
		String input2 = "Welcome to Hello World";

		StringBuffer str = new StringBuffer(input2);

		String result = str.reverse().toString();

		System.out.println(result);
	}
}
