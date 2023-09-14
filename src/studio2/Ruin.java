package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("What is your starting amount of money?");
		int startAmount = in.nextInt();
		System.out.println("What is your win probability?");
		double winChance = in.nextDouble();
		System.out.println("What is your win limit?");
		int winLimit = in.nextInt();

		System.out.println("How many days will we simulate?");
		int totalSimulations = in.nextInt();
		double win = 0;

		for(int i=1; i<totalSimulations+1; i++) {
			int plays = 0;
			int amount = startAmount;
			while (amount != 0 && amount != winLimit ) {
				double num = Math.random();
				if (num <= winChance) {
					//boolean win = true;
					amount++;
					plays++;
					//System.out.println("win");
				}
				else {
					//boolean win = false;
					amount--;
					plays++;
					//System.out.println("loss");
				}
			}
			if (amount == 0) {
				System.out.println("Ruin");
				System.out.println("Day: "+i);
			}
			else {
				System.out.println("You're Done for the Day! #Success");
				System.out.println("Day: "+i);
				win++;
			}
			System.out.println("Number of plays: "+plays);
		}
		System.out.println("Win rate: "+win/totalSimulations);
		}
	}
