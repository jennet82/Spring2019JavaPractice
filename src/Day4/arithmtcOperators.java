package Day4;

public class arithmtcOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//
		/* Create 2 double variable num1, num2 assign value to the variable
		 * Create 2 more double variable additionResult, substructionResult
		 *
		 *   Print two statement in your console
		 *  the result of addition is ---->> your result
		 *  the result of substruction is ---->> your result 
		 *   
		 */
		double m1 = 300;
		double m2 = 200;
		 
		System.out.println(" m1 + m2 ");
		System.out.println(m1+m2);
		
		System.out.println(" The result of addition is " + ( m1+m2));
		System.out.println("The result of substruction is "+ (m1-m2));
		
		int i = 13 , j = 5 , s = 13, l = 5;
		//print out the result of multiplication,division,modular in one statement
		//by concatenating them
		//your result should be printed using only one statement
		 
		System.out.println("Multiplication result is "+i*j +"."
				+ "Division result is " + i/j + "." +"Modular is " + i%j+"." );
		
		int divisionResult = i/j;
		System.out.println(divisionResult);
		
		double divisionResult2 = s/l;
		System.out.println(divisionResult2);
		
		double x = 11.0;
		double y = 2.0;
		System.out.println( x/y);
		
		int aa = 12;
		double bb = 5 ;
		System.out.println( aa/bb);
		// cause double is bigger than int in bytes
		
		System.out.println("The remainder of division is: " + i%j);
		
		
		
		

	}

}
