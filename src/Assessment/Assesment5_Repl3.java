package Assessment;

public class Assesment5_Repl3 {

	public static void main(String[] args) {
		
	
	int[][] nums = {
			{1,1,2}, //sum = 4
			{3,1,2}, //sum = 6
			{3,5,3}, //sum = 11
			{0,1,2}  //sum = 3
		};
	
	//int size = a.length;
	
		int[] sums = rowSums(nums);
		for(int sum : sums)
			System.out.println(sum);
		//this should print 4 6 11 3
	}
	public static int[] rowSums(int[][] nums) {
		/*int[][] nums = {c1,c2,c3
		 *               {1,1,2}, //sum = 4 //row 1
			             {3,1,2}, //sum = 6 //row 2
			             {3,5,3}, //sum = 11//row 3
	                     {0,1,2}  //sum = 3 //row 4
		* int []
		 */
		//int rowCount = nums.length;
		//int coCount = nums[rowCount-1].length;
		
	 int []newArr=new int [nums.length];
	 
	 for(int row=0; row<nums.length; row++) {//looping through rows
		 
		 for(int col=0; col<nums[row].length; col++) {//looping through columns inside each row
			 
			newArr [row]+= nums[row][col]; 
		 }
		 
	 }
	 return newArr;
	

}
	}

	
