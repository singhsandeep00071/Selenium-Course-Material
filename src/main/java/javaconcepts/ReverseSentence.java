package javaconcepts;

public class ReverseSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Hello how are you";
		
//		output you are how Hello 
		
		String result = "";
		String[] arr = str.split(" ");

//		System.out.print(arr.length); 4

		for (int i = arr.length - 1; i >= 0; i--) {

			result = result + arr[i] + " ";
		}

		System.out.print(result);

	}

}
