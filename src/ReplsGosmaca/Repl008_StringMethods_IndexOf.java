package ReplsGosmaca;

public class Repl008_StringMethods_IndexOf {

	public static void main(String[] args) {
		
//		(the output should be one per line)
//
//		Print out the position of the first occurrence of "c"
//		Print out the position of the first occurrence of " "
//		Print out the position of the first occurrence of the variable target1
//		Print out the position of the first occurrence of the variable target2
		
	    String str = "abracadabra alakazam";
	    String target1 = "dab";
	    String target2 = "ABRA";
	    
	    char find1='c';
	    String find2=" ";
	    char find3='d';
	    char find4='A';
	    
	    System.out.println(str.indexOf(find1));
	    System.out.println(str.indexOf(find2));
	    System.out.println(str.indexOf(find3));
	    System.out.println(str.indexOf(find4));

	}

}
