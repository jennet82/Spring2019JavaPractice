package Day9;

import java.util.Scanner;

public class SimpleIFwithoutCurlyBraces {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter numbers: ");
		
		int x = scanner.nextInt();
		/*
		 * boolean b = false
		 * () inside here, you can put
		 * boolean literal : true,false
		 * boolean variable : b
		 * boolean expression : any operation that result in boolean
		 * 
		 */
		//Curly braces for IF and ElSE blocks are optional
		//ONLY WHEN WE HAVE SINGLE STATEMENT !
		
		//if(x!=10) 
			//System.out.println("NOT 10 !");
			
		//else 
			//System.out.println("YES IT IS 10");
			
		
		if(x != 10)
		   System.out.println("NOT 10 !");
		else 
			System.out.println("YES IT IS 10");
		    System.out.println("YES IT IS 10 AS I said");
		    
			
			   
	}

}
