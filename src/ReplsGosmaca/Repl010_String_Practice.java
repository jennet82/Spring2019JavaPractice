package ReplsGosmaca;

import java.util.Scanner;

public class Repl010_String_Practice {

	public static void main(String[] args) {
		
//		Given a String (already declared for you as str), do the following:
//		Print out the following: "The first 3 letters of ___ is ___"
//
//		For example, if the input is "banana", your output should be "The first 3 letters of banana is ban"

		Scanner inp = new Scanner(System.in);
	  	System.out.print("In:");
	  	String str = inp.nextLine();
	    // Don't change the code above! Write your code below
	  	String sub=str.substring(0, 3);
	  	System.out.println("The first 3 letters of "+str+" is "+sub);
	  	
	    

	}

}
