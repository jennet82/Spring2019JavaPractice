package MentoringsZuhra;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		 // Ask a user to enter login name and pass.
		//create 2 variables, user name and pass to check weather they match,if yes  login succesefully
	   // whenever login is not successful, let  program tell exact reason.
	 //login right                   login wrong :false-->invalid login
	//pass not   --> pass not valid  
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the user name ");
		String Uname = scan.next();
		System.out.println("Enter the user Pass ");
		String Upass = scan.next();
		
		String name = "abcd";
		String pass = "abc123";
		
		if(Uname.equalsIgnoreCase("abcd") && Upass.equals("abc123")) {
			System.out.println("Login Successfull");
			
			
		}else
			if(!Uname.equalsIgnoreCase("abcd") && Upass.equals("abc123")) {
				System.out.println("User is not valid");
			}else if(Uname.equalsIgnoreCase("abcd") && !Upass.equals("abc123")) {
				System.out.println("Pass is not valid");}
		
				else if(!Uname.equalsIgnoreCase("abcd") && !Upass.equals("abc123")) {
					System.out.println("user name and Pass not valid");
	}

	}
}
