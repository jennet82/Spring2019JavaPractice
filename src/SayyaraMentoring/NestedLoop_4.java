package SayyaraMentoring;

public class NestedLoop_4 {

	public static void main(String[] args) {
		
		int[][] numbers = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 7 }, { 5, 9 } };

		int i;
		outer: for (i = 0; i < numbers.length; i++) {// outer
			
			System.out.println("outer loop works ");
			inner: for (int j = 0; j < numbers[i].length; j++) {// inner
				if(numbers[i][j]==7) {
					break outer; 
				}

				System.out.println(numbers[i][j] + " "+" inner loop is working ");
				

			}
			System.out.println();

	}

}
}