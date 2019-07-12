package Repls;

import java.util.Scanner;

public class repl76 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    String sentence = scan.nextLine();
	    for (int i = sentence.length()-1; i >= 0; i--) {
	    	
	    	System.out.print(sentence.charAt(i));
			
		}

	}

}
