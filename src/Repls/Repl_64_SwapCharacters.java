package Repls;

import java.util.Scanner;

public class Repl_64_SwapCharacters {

	public static void main(String[] args) {
		
//		Write a program that will swap first and last characters in the string. Use substring method to slice the string. 
		//Print out result into the console. 
//      Example #1
//		input: apple
//		output: eppla
//
//		Example #2
//		input: pursuit
//		output: tursuip
		
		Scanner scan = new Scanner(System.in);
	    String word = scan.nextLine();
	    //WRITE YOUR CODE HERE
	    
	    char a=word.charAt(0);
	    char b=word.charAt(word.length()-1);
	    System.out.println(b+word.substring(1, word.length()-1)+a);
	    

	}

}
