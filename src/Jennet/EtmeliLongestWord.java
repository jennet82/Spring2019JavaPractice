package Jennet;

import java.util.Scanner;

public class EtmeliLongestWord {

	public static void main(String[] args) {
		
		//Write a program that will print out the longest word
		//repl 58
		
		
		Scanner scan = new Scanner(System.in);
	    String word1 = scan.next();
	    String word2 = scan.next();
	    //WIRTE YOUR CODE HERE
	    int name1=word1.length();
	    int name2=word2.length();
	    
	    // if(name1<name2){
	    //   System.out.println(word2);
	    // }else
	    // System.out.println(word1);
	   // ===================
	    String longWord = (name1>name2)?word1:word2;
	    System.out.println(longWord);
	    
	    //switch?

	}

}
