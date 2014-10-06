//Write a program that enters a positive integer number num and converts
//and prints it in hexadecimal form. You may use some built-in method
// from the standard Java libraries.

import java.util.Scanner;

public class DecimalToHexadecimal {
	private static Scanner input;

	public static void main(String[] args) {
		System.out.println("Enter a decimal number:");
		input = new Scanner(System.in);
		int num = Integer.parseInt(input.nextLine());
		
		System.out.println("In hexadecimal:");
		System.out.println(convertToHexadecimal(num));
	}
	
	public static String convertToHexadecimal(int num) {
		return Integer.toHexString(num).toUpperCase();
	}
}