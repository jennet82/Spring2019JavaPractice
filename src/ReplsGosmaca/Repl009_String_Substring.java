package ReplsGosmaca;

public class Repl009_String_Substring {

	public static void main(String[] args) {
		
//		(all output should be one per line)
//
//		On line 6, write a print statement that prints out a substring of str starting at index 5 and going to the end
//		On line 7, write a print statement that prints out a substring of str starting at index 7 and ending at index 10
//		On line 10, fill in the () in substring so that it prints "harambe"
//		On line 11, fill in the () in substring so that it prints "t f"
		
		 String str = "laptops out for harambe";
		    
		    //write code below
		    String sub1=str.substring(5, 23);
		    String sub2=str.substring(7, 10);
		    
		    //fill in the blanks below:
		    System.out.println(str.substring(16,23)); //fill in substring so it prints "harambe"
		    System.out.println(str.substring(10,13)); //fill in substring so it prints "t f"

	}

}
