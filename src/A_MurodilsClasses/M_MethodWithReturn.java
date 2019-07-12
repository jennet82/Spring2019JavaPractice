package A_MurodilsClasses;

public class M_MethodWithReturn {
	public static void main (String[] args) {
		int amount = giveme5$();
		System.out.println(amount);
		
		System.out.println(giveme5$());
		//get president name from method and assign to president
		//then print out "US president is [president]
		String president=getPresidentName();
		System.out.println("US president is "+ president);
		
		System.out.println("US president is "+ getPresidentName());
		
		String firstName =getFirstName();
		String lastName =getLastName();
		String email =firstName +"_"+lastName +"@gmail.com";
		System.out.println(email);
		
		
		     //method that returns value
		email= getFirstName()+"_"+getLastName()+"@yahoo.com";
		System.out.println(email);
		
	}
	public static int giveme5$() {
		int d =5;
	
		return 5;
	}
	public static String whatisyourName() {
		String name ="Jennet";
		return name;
	}
	public static String getPresidentName() {
		return "Trump";
}
	
	//Methods 1)getFirstName, 2)getlastName
	//main you will call these and build an email
	//String email =[firstname] [lastname] @gmail.com
	
	public static String getFirstName() {
		return "Mike";
		
	}
	public static String getLastName() {
		return "Smith";
	}
	
	
	
	
	
	
}
