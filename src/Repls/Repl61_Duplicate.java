package Repls;

import java.util.Scanner;

public class Repl61_Duplicate {

	public static void main(String[] args) {
		
		
//		You have 2 words
//		Print the first word, second word, second word, first word
//
//		Input:
//		one
//		two
//		Output: 
//		onetwotwoone
		
		
		Scanner scan = new Scanner(System.in);
	    String word1 = scan.next();
	    String word2 = scan.next();
	    //YOUR CODE HERE
	    String a=word1.concat(word2)+word2.concat(word1);
	    System.out.println(a);

	}

}
