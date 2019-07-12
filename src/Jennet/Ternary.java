package Jennet;

import java.util.Scanner;

public class Ternary {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		double price=99.99;
		price=scan.nextDouble();
		
		String result;
		result=(price>100)?"expensive":"cheap";
		System.out.println(result);
		
		
		
	}

}
