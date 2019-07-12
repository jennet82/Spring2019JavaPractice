package Day6;

import java.util.Scanner;

public class ScannerTask2 {

	public static void main(String[] args) {
		
		//creating scanner object
	     Scanner input = new Scanner(System.in);
	     
	     //shortcut for importing is COMMAND/CONTROL + SHIFT+O
	     //ask user questions
	     System.out.println("Enter your name today :");
	     
	     //save user input into String
	     String name= input.next(); // This will only pick up a word as a String
	     
	     System.out.println("Enter your birth year :");
	     
         int birthYear = input.nextInt();
	     int age = 2019-birthYear ;
	     
	     
	     System.out.println("Your name is :" + name);
	     System.out.println("Your age is :" + age);
	     System.out.println("Your age is :" + (2019 - birthYear));
	     
	     
	}    
	

}
