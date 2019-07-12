package A_MurodilsClasses;

	public class M_MyClass{//Method review
	
	
		
	public static void main(String[] args) {
	
		myMethod1();
		myMethod2("Tuesday");
		myMethod3("Wednesday","Java");
		myMethod4("Thursday",2,"Java");
		
	}
		public static void myMethod1() {
			String day = "Saturday";
			String myClass="Java methods";
			System.out.println("Today is "+ day +", we are studying"+ myClass);
			
			}
		public static void myMethod2(String day) {
			String myClass="Java methods";
			System.out.println("Today is "+ day +", we are studying"+ myClass);
			
		}
		public static void myMethod3(String day,String topic) {
			
			System.out.println("Today is "+ day +", we are studying"+ topic);
			
	}
		public static void myMethod4(String day,int hours,String topic) {
			System.out.println("Today is "+ day +", we are studying"+ topic+
					" for " +hours+" hours.");
			
	}
	}

