package Day32;

import java.util.Random;

public class GiveMeBiggerNumber {

	public static void main(String[] args) {
		
		System.out.println(GiveMeBiggerNumber());
	}

	public static byte GiveMeBiggerNumber() {
		
		GiveMeBiggerNumber Number = new GiveMeBiggerNumber();
		int num1 = Number.nextInt(15000*29) + 100;
		
		
		GiveMeBiggerNumber Number2 = new GiveMeBiggerNumber();
		int num2 = Number.nextInt(1500*12) + 1000;
		
		
		int max = num1 > num2 ? num1 : num2;
		return (byte) num1;

	}

	private int nextInt(int i) {
		// TODO Auto-generated method stub
		return 0;
	}

}
