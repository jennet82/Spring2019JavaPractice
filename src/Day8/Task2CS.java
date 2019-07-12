package Day8;

import java.util.Scanner;

public class Task2CS {

	public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);	
	
	double iphonePrice = 599.99, ipadPrice= 899.99, yourBudget;
	int  phoneCount, tabletCount;
	
	
	System.out.println("How many phones? ");
	phoneCount = input.nextInt();
	
	System.out.println("How many tablets?");
	tabletCount = input.nextInt();
	
	System.out.println("My budget is: ");
	yourBudget = input.nextDouble();
	
	double total = iphonePrice*phoneCount + ipadPrice*tabletCount;
	
	System.out.println(total);
	
	if (total > yourBudget) {
		
		System.out.println("OUT OF BUDGET");
		System.out.println("You need extra "+ (total-yourBudget));
		
	}else {
		
		System.out.println("I will buy it!");
	}
	

		

}
}
