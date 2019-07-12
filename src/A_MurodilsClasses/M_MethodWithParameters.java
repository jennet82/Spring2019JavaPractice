package A_MurodilsClasses;

public class M_MethodWithParameters {
	public static void main (String[] args) {
		
		System.out.println(getMax(100, 3));
		
		int myNum=getMax(34, 90);
		
		System.out.println("MyNum"+myNum);
		
		boolean valid=isValidDay("Monday");
		System.out.println(valid);
		 
		valid=isValidDay("funday");
		System.out.println(valid);
		 
		valid=isValidDay("SaTurday");
		System.out.println(valid);
		 
		
		
		
		
	}
	//Method getMax that accepts 2 ints and return larger one

	public static int getMax(int num1, int num2) {
		int largest;
		
		if(num1>num2) {
			largest = num1;
			}else {
				largest=num2;
			}
		return largest;
	}
	//isValidDay method: accept a weekdayNmae, and checks
	//if it is a valid one of 7 days then return true,otherwise 
	//return false
	
	public static boolean isValidDay(String day) {
		day=day.toLowerCase().trim();
		
		if(day.equals("monday") || day.equals("tuesday")
				||day.equals("wednesday")||day.equals("thursday")
				|| day.equals("friday") || day.equals("saturday")||
				day.equals("sunday")) {
		return true;
		}else {
			return false;
		}

}
}
