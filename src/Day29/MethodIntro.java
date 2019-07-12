package Day29;

public class MethodIntro {

	public static void main(String[] args) {
		
		//release the horse
				// method that does not take external data
				//method that does not return any value
				//method that does not need an object to be called.
					/*
					 * Arrays.toString(arr);
					 * MethodIntro.releaseTheHorse
					 * 
					 * public == access modifier to define where it can be used
					 * static == non-access modifier ; if defined no object needed to call this
					 * 	
					 * void == method take only action and does not return any value
					 * 
					 */
				
				MethodIntro.releaseTheHorse(); //prints message for the first time
				
				MethodIntro.releaseTheHorse(); // prints message the second time
				MethodIntro.releaseTheHorse(); // prints message the third time
			}
			
			public static void releaseTheHorse() {
				
				System.out.println("Pause it now now go go go break time that is!");
				

	}

}
