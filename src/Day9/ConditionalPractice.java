package Day9;

public class ConditionalPractice {

	public static void main(String[] args) {
		
		int i = 10 , j=21; //j =20; 
		
		//TASK2
		  //write if statement to check if i is more than 5
		  // and j is odd number
		  
		 //optional add one more condition to your if statement 
		 // to check sum of i and j is 31(30)
		
		//if( i>5 && j%2==1 ){
		if(( i>5) && (j%2==1)&& (i+j==31)) {
			
			System.out.println("BINGO!!!");
			
		}else {
			System.out.println("Try again, Spartans!");
			
		}
		
	}

}
