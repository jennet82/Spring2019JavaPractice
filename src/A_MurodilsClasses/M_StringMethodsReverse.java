package A_MurodilsClasses;

public class M_StringMethodsReverse {
	/*
	 * Method: reverse
	 * Params: 1 String
	 * Return type: String
	 * It reverses the Param string and returns the result
	 * 
	 */
	      public static void main(String[] args) {
	    	  String original="java java";
	    	  String reversed=reverse(original);
	    	  
//	    	  for(int i=original.length()-1; i>=0; i--) {
//	    		 // reversed = reversed + original.charAt(i);
//	    		  reversed +=original.charAt(i);
//	    		  
//	    	  }
	    	  System.out.println(reversed);
	    	  
	    	  System.out.println( reverse("computer"));
	      }
	public static String reverse(String original) {
	String reversed="";
	  
	  for(int i=original.length()-1; i>=0; i--) {
		 // reversed = reversed + original.charAt(i);  1 variant
		  //reversed +=original.charAt(i);             2 variant
		  reversed +=original.substring(i, i+1);     //3 variant

	  }
	  return reversed;
	}
	

}
