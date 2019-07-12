package Jennet;

import java.util.Scanner;

public class Mentoring {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int num = s.nextInt();
		System.out.println("Enter the number:");
		
        int quarter,dime,nickel,penny;
        
        quarter= num/25;
        num=num%25;
        dime=num/10;
        num=num%10;
        nickel=num/5;
        num=num%5;
        penny=num/1;
        
        

	}

}
