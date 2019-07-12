package A_MurodilsClasses;

import java.util.Scanner;

public class M_Calculator {
	/*
	 * 1. add -->2 double arguments/parameters/inputs
	 *  adds numbers and prints the result
	 *  
	 * 2. Subtract --> 2 double arguments/parameters/inputs
	 *  Subtract numbers and print the result
	 *  
	 * 3. multiply --> 2 double arguments/parameters/inputs
	 *  multiplies numbers and prints the result 
	 *  
	 * 4. divide --> 2 double arguments/parameters/inputs
	 *  divides numbers and prints the result
	 */
	public static void main(String[] args) {
		double n1=10;
		double n2=5;
		
		add(1234, 400);
		subtract (n1, n2);
		multiply (n1, n2);
		divide (n1, n2);
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter 2 numbers: ");
		n1 = input.nextDouble();
		n2 = input.nextDouble();
		
		System.out.println("Choose operation: \n" +
		              "1 - add\n"+
				      "2 - subtract\n"+
		              "3 - multiply\n"+
				      "4 - divide");
		/*
		 * for add select 1
		 * for subtract select 2
		 * for multiply select 3
		 * for divide select 4
		 */
		int operation = input.nextInt();
		switch(operation) {
		case 1:
			add(n1, n2);
			break;
		case 2:
			subtract(n1, n2);
			break;
		case 3:
			multiply(n1, n2);
			break;
		case 4:
			divide(n1, n2);
			default:
			System.out.println("ERROR: Invalid Operation");
		}
	}
	
	public static void add(double num1,double num2) {
		double result = num1 + num2;
		System.out.println(result);
	}
	public static void subtract(double num1, double num2) {
		double result1 = num1-num2;
		System.out.println(result1);
	}
	public static void multiply(double num1, double num2) {
		double result2 = num1*num2;
		System.out.println(result2);
	}
	public static void divide(double num1, double num2) {
		if(num2==0) {
			System.out.println("ERROR: Cannot divide by");
		}else {
			
		}
		double result3 = num1/num2;
		System.out.println(result3);
	}

}
