package Assessment;

import java.util.Scanner;

public class Assesment5_Repl1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp =new Scanner(System.in);
		System.out.println("In: ");
		String word=inp.nextLine();
		
		
		//String word="howdyho"; without scanner
		
		// write your code below
		String vowels="aeiou";
		
		for(int i=0; i<word.length(); i++){
		if(vowels.contains(word.charAt(i)+"")) {
			System.out.print(word.charAt(i));
		}
		}

	}

}
