package Day35;

public class WarmUp {

	public static void main(String[] args) {
		
		/*
	     * // Warm up
	      Create a static method called findLongestWord
	      this method have one parameter as String vararg
	      and return the longest word as String
	     * */
	    String[] names = {"abc","c","hyght"}; 
	    
	    String longestWord = names[0];
//	    with FOR EACH LOOP
	    for (String name : names) {
	      
	      if(name.length() > longestWord.length()) {
	        longestWord = name ; 
	      }
	      
	    }
//	   with FOR LOOP 
//	    for (int i = 0; i < names.length; i++) {
//	      
//	      if(names[i].length() > longestWord.length() ) {
//	        
//	        longestWord = names[i];
//	        
//	      }
//	      
//	    }
	    
	    System.out.println(longestWord);
	    
	    
	    
	    

	}

}
