package Day8;

import java.util.Scanner;

public class Task1CondtSttm {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		System.out.println("What is your score? ");
		
		int score = input.nextInt();
		
		System.out.println("current score is:  "+ score);
		
		if ( score > 60 ) {
			System.out.println("YOU SHALL PASS !");
		}else {
			System.out.println("YOU SHALL NOT PASS !");
			
		
		}	
	}

}
