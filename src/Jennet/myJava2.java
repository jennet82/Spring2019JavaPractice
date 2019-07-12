package Jennet;

import java.util.Scanner;

public class myJava2 {

	public static void main(String[] args) {
		

		
		    //Enter your code here
		    String firstName, lastName, fullName, email, street, state,city,
		    address,contacts;
		    int  age,zipCode;
		    double height,weight;
		    boolean isMarried;
		    long workPhoneNumber,personalPhoneNumber;
		    
		    Scanner input =new Scanner(System.in);
		    
		    System.out.println("Welcome to the patient portal!");
		    System.out.println("Please enter your personal information");
		    System.out.println("Enter your first name");
		    firstName=input.next();
		    System.out.println("Enter your last name");
		    lastName=input.next();
		    System.out.println("Enter your email");
		    email=input.next();
		    System.out.println("Enter your street");
		    street=input.next();
		    System.out.println("Enter your city");
		    city=input.next();
		    System.out.println("Enter your state");
		    state=input.next();
		    System.out.println("Enter your zipcode");
		    zipCode=input.nextInt();
		    System.out.println("Enter your work phone number");
		    workPhoneNumber=input.nextLong();
		    System.out.println("Enter your personal phone number");
		    personalPhoneNumber=input.nextLong();
		    System.out.println("Enter your age");
		    age=input.nextInt();
		    System.out.println("Enter your height");
		    height=input.nextDouble();
		    System.out.println("Enter your weight");
		    weight=input.nextDouble();
		    System.out.println("Are you married?");
		    isMarried=input.nextBoolean();
//		    fullName=("Full name:")+firstName+","+lastName;
//		    address=("Address:")+street+","+city+","+state+zipCode;
//		    contacts=("Contacts:")+("work phone number-")+workPhoneNumber+","+
//		    ("personal phone number-")+personalPhoneNumber+", "+("email:")+email;
//		    
//		    String age1=("Age: ")+age;
//		    String height1=("Height: ")+height;
//		    String weight1=("Weight: ")+weight;
//		    String isMarried1=("Married?:")+isMarried;
//		    System.out.println(("Patients personal information")+"\n"+fullName+"\n"+
//		    address+"\n"+contacts+"\n"+age1+"\n"+height1+"\n"+weight1+"\n"+isMarried1);
//		    
//		    
		    
		    contacts = "work phone number - " + workPhoneNumber + ", personal phone number - " + personalPhoneNumber + ", email: " + email;
		       fullName= (lastName + ", " + firstName);
		      address  = street + ", " + city + ", " + state + " " + zipCode;
		      
		       System.out.println("Patient personal information");
		       System.out.println("Full name: " +  fullName);
		       System.out.println("Address: " + address);
		       System.out.println("Contacts: " + contacts);
		      System.out.println("Age: " + age);
		       System.out.println("Height: " + height);
		       System.out.println("Weight: " + weight + " pounds");
		       System.out.println("Married?: " + isMarried);
		  
		
		
	}

}
