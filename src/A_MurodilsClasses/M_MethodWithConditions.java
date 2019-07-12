package A_MurodilsClasses;

import java.util.Arrays;

public class M_MethodWithConditions {
	
	public static void main(String[]args) {
		
		getLarger(100, 40);
		int[] arr= {100,30,40,3546,2765,2, -19};
		getMax(arr);
		
		getMax( new int[] {4567, 7685,675,34});
		
		//public static void getMax(int[] nums = new int[] {4567, 7685,675,34})
		
		getMax( new int[] {});
		
		int[] arr2 = new int[] {};
		getMax( arr2 );
		
		steps(0);
		steps(5);
		steps(-3);
		
	}
	/*
	 * create a method getLarger - that accepts 2 numbers and prints larger one.
	 * if they are equal it prints "Numbers are equal: number"
	 */
	public static void getLarger(int num1, int num2) {
		if(num1>num2) {
			System.out.println(num1);
		}else if(num2>num1) {
			System.out.println(num2);
		}else {
			System.out.println("Numbers are equal: "+num1);
		}
	}
	/*
	 *create a method getMax - that accepts an int array and prints
	 *largest number in the array 
	 */
	public static void getMax(int[] nums) {
		//if array is empty, print "ERROR: Array is empty"
		if(nums.length ==0) {
			System.out.println("ERROR: Array is empty");
			return;
			}
		Arrays.sort(nums);
		
		System.out.println(nums[ nums.length -1]);
	}

	/*
	 * create a method steps. it accepts an int parameter.
	 * if the parameter is negative then we print "jump" that many times
	 * -2
	 * Jump 1
	 * Jump 2
	 * 
	 * if it is positive we take steps
	 * Step 1
	 * Step 2
	 * ...
	 */
	
    public static void steps(int times) {
    	if(times==0) {
    		System.out.println("Sit");
    		}else if(times > 0) {
    			for(int i = 1; i<= times; i++) {
    				System.out.println("Steps "+i);
    			}
    		}else if(times<0) {//-5* -1-->5
    			for(int n=1; n<= times*(-1); n++) {
    				System.out.println("Jump "+ n);
    			}
    		}
    }
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

