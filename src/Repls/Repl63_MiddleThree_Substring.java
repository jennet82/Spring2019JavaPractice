package Repls;
import java.util.*;

public class Repl63_MiddleThree_Substring {

	public static void main(String[] args) {
		
//		If the word has odd number of characters
//		and has 5 or more characters, print the middle three 
//		characters of the word. 
//
//		Otherwise print "invalid".
//
//		fifteen ==> fte
//		apple ==> ppl
//		hey ==> invalid
//		java ==> invalid
//		whatsup ==> ats
//		$ ==> invalid
		
		 Scanner scan = new Scanner(System.in);
		    String word = scan.next();
		    //YOUR CODE HERE
		    int x=word.length();
		    if(x%2==1 && x>=5){
		    System.out.println(word.substring(word.length()/2-1,word.length()/2+2));
		    }else
		    System.out.println("invalid");
		    

	}

}
