package A_MurodilsClasses;

public class M_Method_Cooking {
	public static void main(String[] args) {
		cook("Steak");
		youWillNeed("Meat,Oil,Salt,Pepper,Wooden Spoon,Tomato");
		cookFor(50, "Grilling");
		ready();
	}

	public static void cook(String foodName) {
		System.out.println("Today we are cooking "+foodName+".");
		
	}
	public static void youWillNeed(String items) {
		System.out.println("We need following items: "+items+".");
		
	}
	public static void cookFor(int minutes, String wayOfCooking) {
		System.out.println("You need to cook for "+minutes+"minutes by "+wayOfCooking+ ".");
		
	}
	public static void ready() {
		System.out.println("Meal is ready!Enjoy!");
		
	}
}
