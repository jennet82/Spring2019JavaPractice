package Day18;

public class WhileLoopDoesNotAlwayseGoesToBlock {

	public static void main(String[] args) {
		
		int x =100;
		
		while(x<200) {
			System.out.println("do something");
			//x++
			x=x+100;
		}
		System.out.println("END");
	}

}
