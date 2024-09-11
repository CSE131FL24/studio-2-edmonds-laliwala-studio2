package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		
		System.out.println("Enter the start amount:");
		double startAmount = in.nextDouble();
		
		System.out.println("Enter the win limit:");
		double winLimit = in.nextDouble();
		
		System.out.println("Enter the number of days as an integer:");
		int totalSimulations = in.nextInt();		
		
		System.out.println("Enter the win chance as a number between 0 and 1:");
		double winChance = in.nextDouble();	
		
		
		int simulations = 0;
		double money = startAmount;
		double win = 0;
		int plays = 0;
		int days = 0;
				
		for (simulations = 0; simulations < totalSimulations; simulations++) {
			money = startAmount;
			plays = 0;
			days++;
			
			while (money > 0 && money < winLimit) {
			
				win = Math.random();
				if (win <= winChance) {
				win = 1;
				} else {
					win = 0;
				}
			
				if (win == 1) {
				money++;
				} else {
				money--;
				}
			
				plays++;
			}
		
			if (money <= 0) {
			System.out.println("day: " + days + ", plays: " + plays + ", LOSE");
			} else {
			System.out.println("day: " + days + ", plays: " + plays + ", WIN");
			}
		
	}

	}

}
