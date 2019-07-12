package Day50;

public class MethodChaining {

	public static void main(String[] args) {
		
		// STEP1
		methodA();
        //STEP7----->>> END OF EXECUTION
	}
	public static void methodA() {
		
		//STEP2
		 methodB();
		 //STEP6
		System.out.println(" A called ");
		
	}
	public static void methodB() {
		//STEP3
		System.out.println("B called ");
		//STEP4
		methodC();
	}
	
	public static void methodC() {
		//STEP5
		System.out.println(" C called");
	}

}
