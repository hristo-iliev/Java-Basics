//Write a program that enters from the console number n and n strings,
//then sorts them alphabetically and prints them. Note: you might need
//to learn how to use loops and arrays in Java (search in Internet). 

import java.util.Arrays;
import java.util.Scanner;

public class SortArrayOfStrings {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);		
		System.out.println("Write an integer \"n\" -> number of strings to add");
		int count = Integer.parseInt(input.nextLine());
		String[] items = new String[count];
		
		System.out.println("Add words(one in a row)");
		for (int i = 0; i < count; i++) {
			items[i] = input.nextLine();
		}
		input.close();
		
		Arrays.sort(items);
		
		for (String string : items) {
			System.out.println(string);
		}		
	}
}
