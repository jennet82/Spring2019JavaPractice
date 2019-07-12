package Repls;

import java.util.Scanner;

public class Repl89 {

	public static void main(String[] args) {
		
//		Given a string word, print true if "java" appears starting at index 0 or 1 in the string, 
		//such as with "javaxxx" or "xjavaxx" but not "xxjavaxx". The string may be any length, 
		//including 0word = . 
//
//				Example:
//				input: javapython
//				output: true
//
//				Example:
//				input: cjavac++
//				output: true
//
//
//				Example:
//				input: c#javaruby
//				output: false
	
		 boolean exists = false;
		    Scanner scan = new Scanner(System.in);
		    String word = scan.next();
		    int i =0;
		    while(i<2){
		      String sub=(word.substring(i,i+4));
		      if(sub.equalsIgnoreCase("java")) {
		    	  exists=true;
		      }else {
		    	  exists=false;
		      }
		      i++;

	}
		    System.out.println(exists);

}
}
