package Day13;

import java.util.Scanner;

public class Task_1 {

	public static void main(String[] args) {
		
		// TASK 1
				/*
				 * Ask user for two names check for the equality without caring about
				 * the case print result
				 * 
				 * also compare the length of the names if name1 has more character --->
				 * print second character of name1 else print 3rd character of name2
				 * 
				 * // OPTIONAL store the last character of name 2 in char variable and
				 * create switch statement to check few cases as below
				 * 
				 * case 'a' --> print name ended with a case 'b' --> print name ended
				 * with b case 'c' --> print name ended with c if no match print did not
				 * get abc
				 * 
				 */
				Scanner inPut = new Scanner(System.in);
				System.out.println("Enter Name1 :");
				String name1 = inPut.next();
				System.out.println("Enter Name2 :");
				String name2 = inPut.next();

				System.out.println("IS IT SAME name > : " + name1.equalsIgnoreCase(name2));

				int count1 = name1.length();
				int count2 = name2.length();

				if (count1 > count2)
					System.out.println(name1.charAt(1));
				else
					System.out.println(name2.charAt(2));

				// true --> name1.charAt(1) // false: name2.charAt(2)
				// System.out.println( "character is " + ( (count1>count2) ? name1.charAt(1) : name2.charAt(2) ) );

				// what type of data types are supported in switch variable: WHOLE NUMBERS within the range of int (byte,short,int )
				// char , String

				/*
				 * store the last character of name 2 in char variable and create switch
				 * statement to check few cases as below
				 * 
				 * case 'a' --> print name ended with a case 'b' --> print name ended
				 * with b case 'c' --> print name ended with c if no match print did not
				 * get abc
				 */
				// get the last character
				int lastCharIndex = count1 - 1;
				char lastChar = name1.charAt(lastCharIndex);
				System.out.println("last char of name1 is " + lastChar);

				switch (lastChar) {
					
				case 'a':
					System.out.println("name as ended with a ");
					break;
				case 'b':
					System.out.println("name as ended with b ");
					break;
				case 'c':
					System.out.println("name as ended with c ");
					break;
				default:
					System.out.println("NO MATCH AT ALL ");


	}

}
}
