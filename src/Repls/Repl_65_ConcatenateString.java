package Repls;

import java.util.Scanner;

public class Repl_65_ConcatenateString {

	public static void main(String[] args) {
		
		//Write a program that will append two strings 
		//(word1 and word2) together (known as "concatenation") and print the result. 
		//However, if the concatenation creates a double-char, 
		//then omit one of the chars, so "abc" and "cat" yields "abcat".
		
	System.out.println("Enter words: ");
		 Scanner scan = new Scanner(System.in);
		    String word1 = scan.next();
		    String word2 = scan.next();
		    //WRITE YOUR CODE HERE
		    int a=word1.length();
		    int b=word2.length();
		    char c=word1.charAt(a-1);
		    char d=word2.charAt(0);

		    
		    if(c==d){
		      System.out.println(word1.concat(word2.substring(1,word2.length())));
		    }else{
		      System.out.println(word1.concat(word2));

	}

}
}
