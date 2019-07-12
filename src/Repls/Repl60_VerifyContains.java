package Repls;

import java.util.Scanner;

public class Repl60_VerifyContains {

	public static void main(String[] args) {
		
		//Write a program that will verify if word contains in the sentence. Print out the result as boolean value. 
		
		Scanner scan = new Scanner(System.in);
	    String word = scan.nextLine();
	    String sentence = scan.nextLine();
	    //WRITE YOUR CODE HERE
	    if(sentence.contains(word)){
	      System.out.println("true");
	    }else
	    System.out.println("false");

	}

}
