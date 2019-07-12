package Repls;

import java.util.Scanner;

public class repl68 {

	public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in);
		    String word = scan.next();
		    //WRITE YOUR CODE HERE
		    int a = word.length();
		    if(a<5){
		      System.out.println("Too short!");
		      }else if(a>5){
		        System.out.println("Too long!");
		        }else if(a==5);
		   // System.out.println(word.charAt(4)+word.charAt(3)+word.charAt(2)+word.charAt(1)+word.charAt(0));
		    
           String reverse=""+word.charAt(4)+word.charAt(3)+word.charAt(2)+word.charAt(1)+word.charAt(0);
		    
             System.out.println(reverse);
		        }
	}


