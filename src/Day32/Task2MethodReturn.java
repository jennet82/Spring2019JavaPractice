package Day32;

public class Task2MethodReturn {

	public static void main(String[] args) {
		
		// TASK 2 
		  
		  // create a method called isAdultOrNot 
		  // It takes one int as a parameter 
		  //  and return a boolean 
		  // inside body --> if the number passed is more than 18  return true 
		  // else return false 
		  
		  // call your method couple times and print out the result 
		  // either by saving it or directly storing it 
		  

	     boolean result = isAdultOrNot(19) ; 
	     System.out.println(result);
	     System.out.println( isAdultOrNot(16) );
	}

	     public static boolean isAdultOrNot(int age) {
	    	    
//	       if(age>18) {
//	         return true ; 
//	       }else {
//	         return false; 
//	       }
	       return age>18 ;

	}

}
