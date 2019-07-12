package ZuhraMentoring;

import java.util.Arrays;

public class IntroductionToArray {

	public static void main(String[] args) {
		
		int [] numbers=new int[3];
		  numbers[0]=2; 
	          numbers[1]=4; 
	          numbers[2]=9;  
		    
	 System.out.print(numbers[0]+" ");       
	 System.out.print(numbers[1]+" ");
	 System.out.print(numbers[2]+" ");                                                     

	//1. Arrays.toString(name);  //->In order to Print all inside Array.
	 	                                                  //length()--> Char count	                                              length--> size count
	 	   
	  int[]numbers2 = {5,6,7,8};
	 	    
	    // Create String Array

	String[]str = {"Hello","Spartan","batch11"};
	 	   
	 System.out.println();
	 System.out.print(str[0]+" ");      
	 System.out.print(str[1]+" ");
	 System.out.print(str[2]+" ");
	 	    
	  // Using for loop in Array
	 
	 String[]str1 = {"Hello again","best Spartan","batch11"};
	 	    
	 for(int i=0; i<str1.length; i++) {
		    	     System.out.println(str1[i]+ "\n");
	 	    	
	 //Using for each loop
	 for(String item: str1) {
	 	    	 System.out.println(item+"\n"); 
	 	    }    
//	Sort the items inside Array	    
	// Sort  int Array ---> Arrays.sort(arrName); 
//	 	                         Arrays.toString(arr_name); Directly print all the items Arr

	 int[]num = {56,89,345,1,5};
	  
	 Arrays.sort(num);
	 	      System.out.println(Arrays.toString(num));
	 	    
	 	                                                                          //  output  Index
	// How to search targeted item in Array? 

	Arrays.binarysearch(arrName,targetItem);
	 	    
	//Items must be sorted before binarySearch
	 	      
	 int[] number = {34,56,7,32,99};  //       7,32,34,56,99
	    Arrays.sort(number);
	 	     	      System.out.println(Arrays.binarySearch(number,56));
	     
	 // like Substring
	//  CopyOfRange in Array--> newArray= Arrays.copyOfRange(arrName,index,index);
	 	     
	int[] copy = Arrays.copyOfRange(number,2,6); 
	 	 for (int i : copy) 
	   System.out.print(i + "  "); 
	 	  

	}

}
}
