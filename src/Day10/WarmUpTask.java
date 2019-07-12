package Day10;

import java.util.Scanner;

public class WarmUpTask {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Welcome to Cybertek Banking App");
		
		long accountNumber= 12345L;
		String userPassword= "abc123";
		
		System.out.println("Enter your account number: ");
		long account = scan.nextLong();
		scan.nextLine();
		
		System.out.println("Enter your password: ");
		String password=scan.nextLine();
		
		if(accountNumber==account && userPassword.equals(password)) {
		     System.out.println("Login success!");
		}else {
		    	 System.out.println("Login failed!");
		    	 
		    	 System.out.println("end");
		}
	}

}
