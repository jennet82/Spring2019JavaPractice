package A_MurodilsClasses;

public class M_MethodVoid_1 {

	public static void main(String[] args) {
		M_MethodVoid_1.sayHello();
		sayHello();
		askHowRU();
		sayHello();
		reply();
		sayBye();
		sayHelloTo("Selbi");
		sayHelloTo("Sara");
		
		String nameofOnlineFriend="Umit";
		sayHelloTo(nameofOnlineFriend);
		
		//sayHelloTo(100); will not work
		sayHelloTo("100");
		}
		public static void sayHello() {
		System.out.println("Hello!");
	}
	
	public static void sayHelloTo(String name) {
		System.out.println("Hello"+name);
	}
	
	public static void askHowRU() {
		System.out.println("How are you doing?");
	}
	public static void reply() {
		System.out.println("I am doing well, how about you?");
		
	}
	public static void sayBye() {
		System.out.println("Bye! Have a good day!");
	}

}
