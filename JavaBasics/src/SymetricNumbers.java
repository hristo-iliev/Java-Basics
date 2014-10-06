//Write a program to generate and print all symmetric numbers in given range [start…end]
//(0 ≤ start ≤ end ≤ 999). A number is symmetric if its digits are symmetric toward
//its middle. For example, the numbers 101, 33, 989 and 5 are symmetric, but 102, 34
//and 997 are not symmetric. 

import java.util.Scanner;
import javax.management.InvalidAttributeValueException;

public class SymetricNumbers {
	private static Scanner input;

	public static void main(String[] args) throws InvalidAttributeValueException {
		System.out.println("Enter two digits on separate line, that will be the range:");
		System.out.print("First number = ");
		input = new Scanner(System.in);
		int firstNum = input.nextInt();
		System.out.print("Second number = ");
		int secondNum = input.nextInt();
				if (firstNum == secondNum) {
			throw new InvalidAttributeValueException("The numbers must be different!");
		}
		
		int smaller = firstNum < secondNum ? firstNum : secondNum;
		int bigger = firstNum > secondNum ? firstNum : secondNum;
		
		System.out.println("The symetric numbers in given intervals:");
		System.out.println(findSymetricNumbersInRange(smaller, bigger));
		
	}
	
	public static String findSymetricNumbersInRange(int smaller, int bigger) {
		StringBuilder result = new StringBuilder();
		
		for (int i = smaller; i <= bigger; i++) {
			String num = Integer.toString(i);
			if (num.equals(new StringBuilder(num).reverse().toString())) {
				result.append(num + " ");
			}
			
		}
		return result.toString().trim();
	}
}
