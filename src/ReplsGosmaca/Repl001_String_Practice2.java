package ReplsGosmaca;

import java.util.Scanner;

public class Repl001_String_Practice2 {

	public static void main(String[] args) {
		
//		Given three variables:
//			String str
//			int start
//			int end
//
//			Print out the following string:
//
//			The substring of (str) from (start) to (end) is (substring from start to end, inclusive)
//
//			Sample output:
//			In: lolwut
//			Start: 2
//			End: 4 
//			The substring of lolwut from 2 to 4 inclusive is lwu
//			 
//			PLEASE NOTE that we are counting the end index in our output!
//
//			lolwut
//			012345

		Scanner inp = new Scanner(System.in);
	  	System.out.print("In:");
	  	String str = inp.nextLine();
	  	System.out.print("Start:");
	  	int start = inp.nextInt();
	  	System.out.print("End:");
	  	int end = inp.nextInt();
	    // Don't change the code above! Write your code below
	    int sub=start;

	}

}
