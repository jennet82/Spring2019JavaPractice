package MentoringEmrayPala;

import java.util.Scanner;

public class ArrayDouble {

	public static void main(String[] args) {
		
		/*OCA book and OCA question
		 * Requirement:Ask to enter 20 numbers,declare them as a double into an array then find the difference 
		 * from the last number and the other numbers. 
		 */

		
			double []arr=new double[20];
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter 20 number: ");
			for(int i=0;i<arr.length;i++) {
				arr[i]=sc.nextDouble();
			}
			double lastNumber=arr[arr.length-1];
				System.out.println("the last number read is: " + lastNumber);
				System.out.println("The numbers read "+ "difference from lastNumber are: ");
				for(int i=0;i<arr.length;i++) {
					System.out.println(arr[i]+" difference from the last number is: "+(arr[i]-lastNumber));
				}

	}

}
