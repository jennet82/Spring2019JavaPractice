package Mysecondpackage;

import java.util.Scanner;

public class BasicExampleFor52 {

	public static void main(String[] args) {
		
		String meal, chips,drinks;
		
		int amountOfChips;
		double price=0.0;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Select meal: ");
		
		meal = scan.next();
		
		if (meal.equals("Burger")) {
			price =price+10; //price+=10
		 if (meal.equals("Chicken")) {
			 price+=8;
			 if (meal.equals("Veggie")) {
				 price+=6;
				 
				 System.out.println("Chips?");
				 chips= scan.next();
				 
				 System.out.println("How many?");
				 amountOfChips=scan.nextInt();
				 
				 if(chips.equals("yes")) {
					 price=price+(amountOfChips*0.5);//price=amountOfChips*0.5
					 System.out.println("Select drinks: ");
					drinks=scan.next(); 
					 
				 }
				 
			 }
		 }
			
			
		}
		
		
		

	}

}
