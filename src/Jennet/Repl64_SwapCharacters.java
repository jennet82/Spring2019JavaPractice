package Jennet;

import java.util.Scanner;

public class Repl64_SwapCharacters {

	public static void main(String[] args) {
		
		System.out.println("Enter a word: ");
		
		Scanner scan = new Scanner(System.in);
		String word = scan.nextLine();
		
		
		char a=word.charAt(0);
		char b=word.charAt(word.length()-1);
		System.out.println(b+word.substring(1,word.length()-1)+a);

	}

}
