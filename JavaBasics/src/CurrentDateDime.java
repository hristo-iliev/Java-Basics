// Create a simple Java program CurrentDateTime.java to print the current date and time. 

import java.time.LocalDate;

public class CurrentDateDime {
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		System.out.println("Today is: " + today);
	}
}
