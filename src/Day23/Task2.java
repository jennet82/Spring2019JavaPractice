package Day23;

public class Task2 {

	public static void main(String[] args) {
		
		// TASK 2 : 
				/*
				 * print from 15 - 5 in one line 
				 * repeat this 4 times 
				 * 
				 * */
				
		
		for (int j=0; j<4; j++) {
			System.out.println("Iteration"+(j+1));
			
			for (int i=15; i>=5; i--) {
				
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

}
