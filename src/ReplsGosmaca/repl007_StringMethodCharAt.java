package ReplsGosmaca;

public class repl007_StringMethodCharAt {
	
//	ALL print statements in this exercise should be on one line, no newlines.
//
//	Print out the character in the 5th index of the String str
//	Print out the character in the 8th index of the String str
//	Print out the character in the 1st index of the String str
//	Print out the index in the i-th index of the String str 
//  (i is a variable already declared for you)


	public static void main(String[] args) {
		String str = "boopity bop";
	    int i = 10;
	    char ch1=str.charAt(5);
	    char ch2=str.charAt(8);
	    char ch3=str.charAt(1);
	    char ch4=str.charAt(i);
	    System.out.print(""+ch1+ch2+ch3+ch4);

	}

}
