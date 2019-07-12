package A_MurodilsClasses;
import java.util.*;

public class M_MethodWithReturn01 {//GuessTheNumber
	public static void main(String[] args) {
		//playGuessNumComputerOnly();
		playGuessNumWithLimits(20);
		playGuessNumWithLimits(50);
		playGuessNumWithLimits(2);
		sayHi();
		
	}
	
	//public static void playGuessNumComputerOnly() {
	public static void playGuessNumWithLimits(int limit) {
		Random random = new Random();
		int secretNumber = random.nextInt(21);
		int counter=0;//to know how many times
		
		do {
			counter++;//to know how many times
			System.out.println("Guess the secret number:");
			int guessNumber = random.nextInt(21);
			System.out.println("Guessing :"+ guessNumber+" Counter:"+counter);
			if(guessNumber == secretNumber) {
				System.out.println("You won! Guessed the Secret Number!");
				break;
			}else {
				System.out.println("Wrong! Try again!");
			}
			if(counter==limit) {
				System.out.println("You Lost! Game over!");
				break;
				
			}
		}while(true);
		
		
	}
	public static void sayHi() {
		System.out.println(1234);
		System.out.println("Hello");
		System.out.println(true);
	}

}

