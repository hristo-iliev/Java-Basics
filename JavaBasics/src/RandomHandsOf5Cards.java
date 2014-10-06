//Write a program to generate n random hands of 5 different cards form
//a standard suit of 52 cards.

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class RandomHandsOf5Cards {
	private static Scanner input;
	private static ArrayList<ArrayList<String>> hands;

	public static void main(String[] args) throws Exception {
		System.out.println("Enter the number of random generated hands:");
		input = new Scanner(System.in);
		int n = input.nextInt();
		
		hands = new ArrayList<ArrayList<String>>();
		
		for (int i = 0; i < n; i++) {
			hands.add(new ArrayList<String>());
			for (int j = 0; j < 5; j++) {
				String card = getRandomCard();
				if (hands.get(i).contains(card)) {
					j--;
				} else {
					hands.get(i).add(card);
				}
			}			
		}
		
		//Printing hands
		for (int i = 0; i < hands.size(); i++) {
			System.out.println((i + 1) + ": " + String.join(" ", hands.get(i)));
		}		
	}
	
	public static String getRandomCard() throws Exception {
		String card = new String();
		card = getRandomCardNumber() + getRandomCardSuit();
		return card;
	}
	
	public static String getRandomCardNumber() {
		Random rand = new Random();
		int num = rand.nextInt(13) + 1;
		
		switch (num) {
		case 1:
			return "A";
		case 11:
			return "J";
		case 12:
			return "Q";
		case 13:
			return "K";
		default:
			return Integer.toString(num);
		}		
	}
	
	public static char getRandomCardSuit() throws Exception{
		Random rand = new Random();
		int num = rand.nextInt(4) + 1;
		
		switch (num) {
		case 1: 
			return '♠';
		case 2:
			return '♥';
		case 3:
			return '♦';
		case 4:
			return '♣';
		default:
			throw new Exception("Invalid card suit!");
		}
	}
}
