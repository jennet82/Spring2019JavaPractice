package Day6;

import java.util.Scanner;

public class UsingComparisonOperator {

	public static void main(String[] args) {
	
		
		//creating scanner object
	     Scanner input = new Scanner(System.in);
	     
	     //ask user questions
	     System.out.println("Enter num1 :");
	     int num1= input.nextInt();
	     System.out.println("Enter num2 :");
	     int num2= input.nextInt();
	     
	     boolean isGreater = num1 > num2;
	     
	     System.out.println("Is num1 greater than num2 :" + isGreater);
	     

	     
	     
	}	

}
