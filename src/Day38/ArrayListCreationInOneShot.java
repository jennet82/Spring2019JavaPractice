package Day38;

import java.util.Arrays;
import java.util.List;


public class ArrayListCreationInOneShot {

	public static void main(String[] args) {
		
		
		// Arrays.asList(var arg) can be used to 
	    // add items while object is being created 
	    
	    // However , 
	    // 1 , The variable type MUST BE A LIST 
	    // because the method return List not ArrayList 
	    // 2 , It will generate a unmodifiable list 
	      // can not add or remove item 
	    
	    List<Integer> lst = Arrays.asList(3,5,6,7,5,4,3); 
	    //lst.add(100) ; 
	    //lst.remove(0); 
	    
	    //lst.set(0, 100); 
	    
	    System.out.println(  lst );
	    
	    
	    
	    List<String> JLA = Arrays.asList("Superman","Batman","Wonder Woman"); 
	    System.out.println(  JLA );
	    

	}

}
