package MentoringsZuhra;

public class StringExamples {

	public static void main(String[] args) {
		// to find the count of the char inside the string we use 
		//.length()-->returns int number
		        //index 01234567890123
		
		String name1 = "HURMA HAYITOVA";
	           // length12345678901234  
		
		String name2 = "jennet aganzayova";
		
		   int n1 = name1.length();
		System.out.println("THe length is "+n1);   
		
		 int n2 = name2.length();
		System.out.println("The length is "+n2); 



//charAt(index number )returns char value. 

char c1 = name1.charAt(0);
char c2 = name2.charAt(0);
System.out.println("char value "+c1);
System.out.println("Char value "+c2);



// name.equals -->Returns true if two string are equals ,
//false if not(returns boolean value)

boolean b1 = name1.equals("zzsffd");
boolean b2 = name2.equals("yubhjh");
System.out.println("is it equal "+b1);
System.out.println("Is it equal "+b2);




// name.equalsIgnoreCase();Returns true if two string are equals--> Boolean answer T/F
 
boolean b3 = name1.equalsIgnoreCase("Hurma hayitova");
System.out.println(b3);



 // toLowerCase method will return the string to lower case without changing original 
 
String name11 =name1.toLowerCase();
 
 System.out.println(name11);
 System.out.println(name1);
 
// toUpperCase method will return the value to Upper case leters without changing the original one
String name22= name2.toUpperCase();   
 
 System.out.println(name22);
 System.out.println(name2);
 
// contains(anothString) method gets the string and 
//check weather it has the given char & returns Boolean value
 
 boolean b4 = name1.contains("Da");
 System.out.println(b4);
 boolean b5 = name1.contains("HURMA");
 System.out.println(b5);


 
	}

}
