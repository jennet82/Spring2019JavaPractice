package Day9;

import java.util.Scanner;

public class LoginTest {

	public static void main(String[] args) {
	
		String userName = "user";
		String password = "abc123";
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter userName: ");
		userName = scan.next();
		
		System.out.println("Enter password: ");
		password = scan.next();
		
		boolean userExist = userName.equals("user");
		
		boolean passwordCorrect = password.equals("abc123");
		
		if(userExist==true && passwordCorrect==true) {		
		                      //OR
		//if (userName.equals("user") && password.equals("abc123")) {
		   System.out.println("Login successful");
		   
		}else {
			 System.out.println("Login failed");
		}

		
	}

}
