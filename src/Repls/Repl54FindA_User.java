package Repls;

import java.util.Scanner;

public class Repl54FindA_User {

	public static void main(String[] args) {
		
//		Assume that you have only 2 users: Max Payne and Alan Wake.  First, ask user to enter full name. 
		//Display message: "Enter full name:". Then take input from user. 
		//If name is equals to either "Max Payne" or "Alan Wake",  display message: "User found!".
		//Otherwise,  display message: "User not found!". Please make your search case insensitive!
//
//		Example:
//		Display message: Enter full name:
//		input: Max Payne
//		Display message: User found!
	
		Scanner scan = new Scanner(System.in);
	    //WRITE YOUR CODE HERE 
	    

	    				
//		System.out.println("Enter full name:");
//		String contact=scan.nextLine();
//		String name1="Max Payne";
//		String name2="Alan Wake";
//		if(contact.equalsIgnoreCase(name1)||contact.equalsIgnoreCase(name2)) {
//		System.out.println("User found!");
//		}else {
//			System.out.println("User not found!");
//		
//		
		String contact;
	    System.out.println("Enter full name: ");
	    contact=scan.nextLine();
	    String name1="Max Payne";
	    String name2="Alan Wake";
	    String str=(contact.equalsIgnoreCase(name1)||contact.equalsIgnoreCase(name2))?"User found":"User not found";
	    
	    
		
		
	    		
		

	}

}
