package MentoringEmrayPala;

import java.util.Arrays;

public class ArrayFruits {

	public static void main(String[] args) {
		
		String [] fruits= {"apple","grapes","avacado","kiwi","banana"};
		//use for each loop
		for(String fruit: fruits) {
			System.out.println(fruit);
		}
		Arrays.sort(fruits);
		 System.out.println(Arrays.deepToString(fruits));
			

	}

}
