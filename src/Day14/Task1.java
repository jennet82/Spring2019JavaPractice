package Day14;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
		
		String name="Jennet";
		int count = name.length();
		
		System.out.println( name.substring(count -1, count));
		System.out.println( name.substring(0, 2));
		System.out.println( name.substring(0, 6));
		
		int midPoint = count/2;
		System.out.println( midPoint);
		System.out.println( name.substring(midPoint,count));
		
		
		
		Scanner input = new Scanner(System.in);
		
	}
	

}
