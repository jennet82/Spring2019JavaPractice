package A_MurodilsClasses;

public class M_StringMethod_Palindrome {
	/*
	 * Method:isPalindrome
	 * Param: 1. String
	 * Return type: boolean
	 * If param String is Palindrome returns true otherwise returns false
	 * 
	 * isPalindrome("civic")--> true
	 * isPalindrome("racecar")-->true
	 * isPalindrome("something")-->false
	 */
	public static void main(String[]args) {
		boolean isPal =isPalindrome("level");
		System.out.println(isPal);
		
		String word="java";
		
		if(isPalindrome(word)) {
		System.out.println("Word is Palindrome");	
		}else {
			System.out.println("Word is not Palindrome");
		}
	}
	public static boolean isPalindrome(String str) {
		//Reverse the string str first
		String reversed ="";
		for(int i=str.length()-1;i>=0; i--) {
			reversed+=str.charAt(i);
		}
	//	Compare if str and reversed are same
		if(str.equalsIgnoreCase(reversed)) {
			return true;
		}
		return false;
		
	//	return str.equalsIgnoreCase(reversed);
		
		}
	 //VERSION 2 OF ISPALINDROME that call reverse method
	
//	public static boolean isPalindromeV2(String str) {
//		//return reverse(str).equalsIgnoreCase(str);
//		if(reverse(str).equalsIgnoreCase(str)) {
//			return true;
//		}
//		return false;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


