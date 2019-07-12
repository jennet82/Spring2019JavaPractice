package SayyaraMentoring;

public class StringArrays2 {

	public static void main(String[] args) {
		String[] products = new String[] { "apple", "banana", "pear", "bread", "pie" };
		for (int i = 0; i < products.length; i++) {
			
			// .equal is always a better way to compare a String with another
			if (products[i].equals("pear")) {
				// Keep in mind that i itself with out [ ] represents index numbers.
				System.out.println("Bingo! Item is found at location: " + i);
				// If you found the item, break out of the loop,
				// You don't need to continue looping,
				break;
			}
		}
		System.out.println("______________ Let's search a letter 1 __________________");

		// Task: Print out the location of products that have the letter 'p'
		for (int i = 0; i < products.length; i++) {

			// .contains() method requires a String. So, str.contains("your String goes here")

			if (products[i].contains("p") == true) { // ==true is optional
				System.out.println("Item including p: " + products[i] + " found at location: " + i);
				//break; // breaks out at the first item found
			}
		}
		System.out.println("______________ Let's search a letter 2 __________________");

		String str = "CyberTek";

		for (int i = 0; i < str.length(); i++) {
			
			//System.out.print(str.charAt(i) + " ");
			
			if (str.charAt(i) == 'r') {
				System.out.println("\nThe letter 'r' is found at index : " + i);
				break;
			}
		}
		System.out.println();
		System.out.println("__________ An easier way to search a letter 3 ___________");

		// The whole things above can be done easily like this below
		System.out.println(str.indexOf("T"));

		// if we search letters that do not exist in the String it returns -1
		System.out.println(str.indexOf("ABC"));

	}

}
