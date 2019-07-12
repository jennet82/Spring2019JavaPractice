package Repls;

import java.util.Scanner;

public class Repl67 {

	public static void main(String[] args) {
		
//		You have 2 words, both of them have 3 characters.
//		If either of them does not have exactly 3 characters, print "cannot merge"
//		Merge their characters one by one and print together like below:
//
//		aok
//		lol
//		alookl
//
//		ear
//		pie
//		epaire
//
//		java
//		wow
//		cannot merge
//
//		hint:
//		by inserting +""+ (empty string) between chars, you can concatenate char values.
		
		
		 Scanner scan = new Scanner(System.in);
		    String word1 = scan.next();
		    String word2 = scan.next();
		    //YOUR CODE HERE
		    int count1=word1.length();
		    int count2=word2.length();
		    //char a1=word1.charAt(word1.length());
		    //char b1=word2.charAt(word2.length());
//		    if(a!=b){
//		      System.out.println("cannot merge");
//		    }else(a==b){
//		      System.out.println(a1+""+b1);
		    if(count1==3 && count2==3){
		    	System.out.println(""+word1.charAt(0)+word2.charAt(0)+word1.charAt(1)+word2.charAt(1)+word1.charAt(2)+word2.charAt(2));
		    }else{
		    	System.out.println("cannot merge");
		    	

	}

}
}
