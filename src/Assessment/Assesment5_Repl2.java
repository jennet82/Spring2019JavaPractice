package Assessment;

import java.util.Scanner;

public class Assesment5_Repl2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	    System.out.print("#1: ");
	    int num1 = s.nextInt();
	    System.out.print("#2: ");
	    int num2 = s.nextInt();
	    //start on line 11
	    //num1=5
	    //num2=9
	    //i:5,6,7,8,9
	    //output: 5 7 9
	    for(int i=num1; i<=num2; i++) {
	    	if(i%2 !=0) {//ODD -->5/2=2, 5%2=1
	    		System.out.print(i+" ");
	    	}
	    }

	}

}
