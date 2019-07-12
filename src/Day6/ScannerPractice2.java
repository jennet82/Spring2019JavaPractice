package Day6;

import java.util.Scanner;

public class ScannerPractice2 {

	public static void main(String[] args) {
		
		//creating scanner object
	     Scanner input = new Scanner(System.in);
	     
	     //shortcut for importing is COMMAND/CONTROL + SHIFT+O
	     //ask user questions
	     System.out.println("Enter your name today :");
	     
	     //save user input into String
	     String name= input.next(); // This will only pick up a word as a String
	     
	     System.out.println("Enter your age today :");
	     //save user input into int
	     int age=input.nextInt();
	     
	     System.out.println("Your name is :" + name + 
	                        "\n Your age is :" + age);
	     
	     //    " \n " ---> next line in System out println
	     
	     
	}

}
