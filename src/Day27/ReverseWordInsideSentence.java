package Day27;

public class ReverseWordInsideSentence {

	public static void main(String[] args) {

		// Optional : Reverse each word in sentence
//		your output should be 
//		ketrebyC hctaB natrapS si tsom gnikrowdrah hctaB reve 
//		Collapse

		/*
	     * String str = "Cybertek Batch Spartan is most hardworking Batch ever";
	      ketrebyC hctaB natrapS si tsom gnikrowdrah eno reve 
	     * */
	    
	    
	    
//	    String str = "Cybertek Batch Spartan is most hardworking Batch ever";
//	    String[] cyberTek = str.split(" ");  
	    
	    String one = "Cybertek" ; 
	    char[] wordChars = one.toCharArray();
	    int lastIndex = wordChars.length-1 ; 
	    
	    for (int i = 0; i < wordChars.length/2; i++) {
	      
	       char temp = wordChars[i]; 
	       wordChars[i] =  wordChars[lastIndex-i] ; 
	       wordChars[lastIndex-i] = temp ; 
	    }
	    //System.out.println( Arrays.toString(wordChars) );
	    // how to change char array to a String 
	    String reversed = new String(wordChars);
	    System.out.println(reversed);
	    
	    
	    
	    
	    
	//    
//	    String revString="";
	//    
//	    for(int k=0;k<cyberTek.length;k++)
//	    {
//	      String word=cyberTek[k];
//	      
//	      String revWord="";
//	      for(int l=word.length()-1;l>=0;l--)
//	      {
//	        revWord=revWord+word.charAt(l);
//	      }
//	      revString=revString+revWord+" ";
//	    }
//	    System.out.println();
//	    System.out.println(revString);
	//
	}

}
