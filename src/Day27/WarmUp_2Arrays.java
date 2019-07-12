package Day27;

import java.util.Arrays;

public class WarmUp_2Arrays {

	public static void main(String[] args) {
		
//		//Task 2 :
//		given : 
//		String str = "Cybertek Batch Spartan is most hardworking Batch ever";
//
//		use the method your learned to get each words
//		and store it into String array: 
		
		String str = "Cybertek Batch Spartan is most hardworking Batch ever";
	    String[] words = str.split(" "); 
	    System.out.println( Arrays.toString(words)  );//birinji bolek, yzy asakda
	    
//		loop through each items -- 
//		  in each iteration loop : 
//		  	 turn each word into char array 
//		  	 print each char out with separated by -
//		output : 
//			C-y-b-e-r-t-e-k-
//			B-a-t-c-h-
//			S-p-a-r-t-a-n-
//			i-s-
//			m-o-s-t-
//			h-a-r-d-w-o-r-k-i-n-g-
//			h-c-t-a-B
//			e-v-e-r-
	    for (int i = 0; i < words.length; i++) { //yokarky bn baglydyr ,ikinji bolek bu
	        //System.out.println(words[i]);
	      
	        String one = words[i] ; //"Cybertek" ;  //C-y-b-e-r-t-e-k-
	        char[] cyberChars = one.toCharArray() ; 
	        
	        for(int j = 0 ; j < cyberChars.length ; j++) {
	          System.out.print(cyberChars[j] + "-");
	        }
	        System.out.println();


	        
	        


	}

}
}
