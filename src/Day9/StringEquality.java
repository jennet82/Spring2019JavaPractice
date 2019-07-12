package Day9;

import java.util.Scanner;

public class StringEquality {

	public static void main(String[] args) {
		
		//String name = "lachyn";
		
		//boolean b = (name =="lachyn");
		//we use method from String class called EQUALS
		
		//boolean b = name.equals("lachyn");
		
		//System.out.println(b);
		
		//TASK2
		//CREATE A name variable to store your name
		//creat a Scanner to ask for a name
		//compare the name with what you entered
		//print out thats my name if it's eqaul
		//print out thats not my name if its not
		
		Scanner scan= new Scanner(System.in);
		System.out.println("ENTER YOUR NAME PLEASE:  ");
		String name = scan.next();
		
		String name1 = "JENNET";
		
		boolean b = name.equals("JENNET");
		
		if ( name.equals("JENNET")) {
			System.out.println("That's JENNET");
			
		}else {
			System.out.println("NOT HER!!!");
		}
		
		
	}

}
