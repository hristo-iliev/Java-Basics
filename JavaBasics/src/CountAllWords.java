//Write a program to count the number of words in given sentence.
//Use any non-letter character as word separator.

import java.util.Scanner;

public class CountAllWords {
	private static Scanner input;

	public static void main(String[] args) {
		System.out.println("Enter a text to count it's words:");
		input = new Scanner(System.in);
		
		String[] words = input.nextLine().split("\\W+");		
		System.out.println("Words count: " + words.length);
	}
}
