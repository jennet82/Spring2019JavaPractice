package Repls;

import java.util.Scanner;

public class Repl62 {

	public static void main(String[] args) {
		
//		2. When word has even number of characters and:
//	           - 4 or more characters, print middle 2
//	     java ==> av
//	     apples ==> pl
//	     #$%^&* ==> %^
//	           - 2 characters, print those 2 characters twice
//	      @@ ==>@@@@
//	      $$ ==>$$$$
//	      hi ==> hihi
		
		Scanner scan = new Scanner(System.in);
	    String word = scan.next();
	    //YOUR CODE HERE
	    int count=word.length();
//	    if(x%2==1 && x>=3){
//	      System.out.println(word.charAt(word.length()/2));
//	    }else if(word.length()==1){
//	      System.out.println(word+""+word+""+word);
//	    }else if(!(x%2==0 && x>=3)){
//	      int a=(x/2);
//	      System.out.println(word.charAt(a));
//	    //}else if ((x%2==0)&&(x>=4)){
//	      System.out.println(word.charAt((x/2)-1)+""+word.charAt(x/2)+1);
	    
	    if(count%2!=0) {
	    	if(count==1) {
	    		System.out.println(word+word+word);
	    	}else {
	    		int middle=count/2;
	    		System.out.println(word.charAt(middle));
	    	}
	    	
	    }else if(count%2==0) {
	    	if(count>=4) {
	    		int middle=count/2;
	    		System.out.println(word.substring(middle-1,middle+1));
	    	}else if(count==2) {
	    		System.out.println(word+word);
	    	}
	    }

	}

}
