package Jennet;

public class StringFirstAndLastVowel {

	public static void main(String[] args) {
		
		String str ="early bird go!";
		System.out.println(go(str));

	}
	public static String go(String str) {
		String vowels="aeiouAEIOU";
		
		int pos1= vowels.indexOf(str.substring(0, 1));
		int pos2= vowels.indexOf(str.substring(str.length()-1));
		if(pos1>-1 || pos2>-1) 
			return "yes";
		else
		    return "no";
	}

}

