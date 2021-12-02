package javaconcepts;

public class ReverseStringWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "Welcome Hello World";

//		output = emocleW olleH dlroW

		String[] arr = input.split(" ");

		for (String word : arr) {
			int j = word.length() - 1;
			String reversedString = "";
			while (j >= 0) {
				char ch = word.charAt(j);
				reversedString = reversedString + ch;
				j--;
			}
			System.out.print(reversedString + " ");
		}
	}

}
