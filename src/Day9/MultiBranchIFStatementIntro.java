package Day9;

import java.util.Scanner;

public class MultiBranchIFStatementIntro {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the score:");
		//Grade book
		int score = 91;
		
		//if score is between 90-A
		//if score is between 80-89
		//if score is between 70-79
		
		//ELSE D and print study harder
		
		
		
		if(score>= 90) {
			System.out.println("YOU GOT A ");
			
		}else if (score >= 80 && score<90) {
			
			System.out.println("YOU GOT B ");
			
		}else if (score>=70 && score<80) {
			
			System.out.println("YOU GOT C ");
			
		}else {
			 
			 System.out.println("study harder ");
			 
		}
	}

}
