package Day35;

public class MethodOverLoading {

	public static void main(String[] args) {
		
		/*
	     * can i use same method name for different methods ? 
	     * YES!!!!
	     * That's called METHOD OVERLOADING
	     * 
	     * Definition:
	     * reusing the name of the method with different method parameters
	     * 
	     * you can have method with different parameter count
	     * you can have method with different parameter type
	     * or both
	     * 
	     * */ 
	    printName(); 
	    printName2("JAVA ");
	    printName3("JAVA ", "Spartan");
	    
	    
	  }
	  
	  public static void printName() {
	    System.out.println(" Method overloading ");
	  }
	  
	  public static void printName2(String name) {
	    System.out.println(" Method overloading " + name);
	  }
	  
	  public static void printName3(String firstName, String lastName) {
	    System.out.println(" Method overloading " + firstName+lastName);

	}

}
