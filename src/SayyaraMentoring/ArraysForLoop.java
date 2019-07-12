package SayyaraMentoring;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysForLoop {

	public static void main(String[] args) {
		
		// Task:
				// Create a String with 5 names
				// Assign 5 names using Scanner
				// Count how many letters 'a' showed up in total in all names

				// String []names=new String[] {"Jennet","Dovlet","Fidan","Fatih",null};

				String[] names = new String[5];// 1st way
				Scanner scan = new Scanner(System.in);
				System.out.println("Please Enter 5 names :");
				for (int i = 0; i < names.length; i++) {
					names[i] = scan.next();
				}
				System.out.println(Arrays.toString(names));
				int count = 0;
				int j = 0;
//				for (j = 0; j < names.length; j++) {
//					String str = "Maral";
//					if (names[j].equals("Maral")) {
//						count++;
//					}
//				}
//				System.out.println(count);
				
				
				//String []names= {"Jennetjan","Dovlet","Fidan","Fatih","Maralgul"} ;
				
				for (j = 0; j < names.length; j++) {
					
					for (int k = 0; k < names[j].length(); k++) {
						if (names[j].charAt(k) == 'a' || names[j].charAt(k) == 'A') {
							count++;

						}

					}
				}
				System.out.println(count);
			}
	}



