package A_MurodilsClasses;

public class AccumulatorMethods {
	
	public static void main(String[] args) {
		String myStars = getStars(5);
		System.out.println(myStars);
		
		System.out.println(getStars(10));
		
		int[] nums = {1,2,3,4,5,6,7,80,7,6,5,4,3,2,1};
		
		for(int n : nums) {
			System.out.println(getStars(n));
		}
		
	}
	
	//method: getStars that accepts an int and returns a string
	//it will return that many *s from method
	//getStars(5) --> *****
	//getStars(2)--> **
	
	public static String getStars(int count) {
		String stars = "";
		for(int i=1; i<=count; i++) {
			stars += "*"; //add one more star
		}
		return stars;
	}

}
