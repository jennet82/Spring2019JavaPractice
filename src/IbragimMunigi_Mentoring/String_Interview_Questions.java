package IbragimMunigi_Mentoring;

public class String_Interview_Questions {
	
	public static void main(String[] args) {
		
		//	1-) reverse string?
			  
			String str = "ibrahimmunigu";
			String newStr = "";
			
			
			StringBuilder sb= new StringBuilder();
			String newStr1 = sb.append(str).reverse().toString();
			
			String newSTR = new StringBuilder(str).reverse().toString();
			System.out.println(newSTR);
			
			for (int i = str.length()-1;i>=0; i--) {
				newStr1 += ""+str.charAt(i);
				
			}
			System.out.println(newStr1);
	}
}
			
			//2-)How to check if two Strings are anagrams of each other? 
			/*		
			String str = "hellow";
			String str1 = "loleh";
			
			char[] ch = str.toCharArray();
			char[] ch1 = str1.toCharArray();
			
			Arrays.sort(ch);
			Arrays.sort(ch1);
			
			if(Arrays.equals(ch, ch1)) {
				System.out.println("it is anagram");
			}else {
				System.out.println("it is not anagram");
			}
			*/
			//3.How to program to print first non repeated character from String?
		    
			//4-)How to program to print all non repeated character from String?
	/*
			String name = "Maral";//aral
			String uniq = "";
			
			while(name.length()>0) {
				String firstletter = name.substring(0,1);
				if(name.substring(1).contains(firstletter)) {
					name = name.replace(firstletter, "");
				}else {
					uniq += firstletter;
					name = name.replace(firstletter, "");
					
				}
			}
			System.out.println(uniq.substring(0,1));
			System.out.println(uniq);*/
			//5-)How to check if a String contains only digits
			/*
			String name = "1234";
			int count =0;
			for (int i = 0; i < name.length(); i++) {
				if('0'<=name.charAt(i)&&name.charAt(i)<='9') {
					count++;
				}
			}
			
			if(count==name.length()) {
				System.out.println("all is digits");
			}else {
				System.out.println("they are not digits");
			}*/
			//6-)How to find duplicate characters in a String?
	/*	
			String name = "dovletmammet";
			String newName ="";
			
			while(name.length()>0) {
				String firstletter = name.substring(0,1);
				if(name.substring(1).contains(firstletter)) {
					newName += firstletter;
					name = name.replace(firstletter, "");
					
				}else {
					name = name.replace(firstletter, "");
				}
			}
			
			System.out.println(newName);*/
			//7-)How to count a number of vowels in a String? 
			/*
			String name = "erdalaeaeeIaA";
			String vowels = "aeuoiAEUOI";
			int count = 0;
			
			for (int i = 0; i < name.length(); i++) {
				if(vowels.contains(""+name.charAt(i))) {
					count++;
				}
			}
			System.out.println(count);*/
			//8-)How to count the number of a given character in String?
	/*
			String name = "bahadir";
			char ch = 'a';
			int count = 0;
		
			for (int i = 0; i < name.length(); i++) {
				if(name.charAt(i)==ch) {
					count++;
				}
			}
	System.out.println(count);*/
		
			//10-)How to check if String is Palindrome?
			/*
			String name = "maral";
			String reverseName = new StringBuilder(name).reverse().toString();
			
			if(name.equalsIgnoreCase(reverseName)) {
				System.out.println("it is palindrome");
			}else {
				System.out.println("it is not palindrome");
			}*/
		
		
			//9-)How to convert numeric String to an int?
			/*
			String name = "1234";
			int num = Integer.parseInt(name);
			int numbers = Integer.valueOf(name);*/
		
		
			//How to remove duplicate characters from String?
//			String name = "hhhhellloo";
//			String newName = "";
//			
//			while(name.length()>0) {
//				String firstletter = name.substring(0,1);
//				if(name.substring(1).contains(firstletter)) {
//					newName += firstletter;
//					name = name.replace(firstletter, "");		
//				}else {
//					newName += firstletter;
//					name = name.replace(firstletter, "");
//				}
//			}
//			
//			System.out.println(newName);
//			

			

				

			//  }}
		



