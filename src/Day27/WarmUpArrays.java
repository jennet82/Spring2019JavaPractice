package Day27;

public class WarmUpArrays {

	public static void main(String[] args) {
		
//		//Task1 : 
//		create an array of int with 5 items , return true if all items are more than 10
//		return false if not
		
		int[] num= {25,28,11,12,53,67};//sanlary utgedip hem gorup bilersin
	    // print true if all are numbers are more than 10
	    // print false if not
	    
	    // print false as long as one number are false 
	    
	    boolean result = true ; 
	    
	    for (int i = 0; i < num.length; i++) {
	      
	      if(num[i]<=10) {
	        result = false ; 
	        break;
	      }
	    }
//	      if(num[i]>10) {
//	        System.out.println("true");
//	      }else {
//	        System.out.println("false");
//	      }
	      
	    
	    System.out.println( result );

	


	}

}
