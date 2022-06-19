package com.aurionpro.test;
import java.util.*;
public class PigDice {

	public static void main(String[] args) {
		Random rand= new Random();
		Scanner sc = new Scanner(System.in);
		char user_input;
		int dice=0;
		int sum_of_dice=0;
		int i;
		System.out.println("Let's Play PIG!\r\n" + "See how many turns it takes you to get to 20.\r\n"+"Turn ends when you hold or roll a 1.\r\n"+"If you roll a 1, you lose all points for the turn.\r\n"+"If you hold, you save all points for the turn.\r\n" );
		for(i=1;sum_of_dice<20;i++) {
			System.out.println("Turn "+i);
			System.out.println("Roll or Hold ? (r/h)");
			user_input=sc.next().charAt(0);
			if(dice==1) {
				dice=0;
			}
			while(user_input=='r' && sum_of_dice<20 && dice!=1){
				dice=1+rand.nextInt(6);// if we use only use rand.nextInt it will even generate 0 to avoid 0 we add +1 so there will be never 0
				System.out.println("Dice "+dice);
				sum_of_dice=sum_of_dice+dice;
				System.out.println("Roll or Hold ? (r/h)");
				user_input=sc.next().charAt(0);
			}
			if(dice==1) {
			
				System.out.println("Turn "+i+ " Looses all scores " );
				sum_of_dice=0;
			}else {
				System.out.println("The total score is "+sum_of_dice);
			}
			if(sum_of_dice>=20 ) {
				System.out.println("You finished in "+i+" turns" );
			}
		}

	}
}

		