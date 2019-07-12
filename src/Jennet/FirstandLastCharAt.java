package Jennet;

import java.util.Scanner;

public class FirstandLastCharAt {

	public static void main(String[] args) {
		
		//Write a program that will print out first and last letters together.
		
		//REPL 59
		
		
		Scanner scan = new Scanner(System.in);
	    String word = scan.next();
	    //WRITE YOUR CODE HERE
	    System.out.print(word.charAt(0));
	    System.out.print(word.charAt(word.length()-1));
	    

	}

}
