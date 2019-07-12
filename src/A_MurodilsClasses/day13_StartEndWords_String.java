package A_MurodilsClasses;

public class day13_StartEndWords_String {

	public static void main(String[] args) {
		String word1 = "javva";
		String word2 = "apple";
		
		if(word1.length()!=5 || word2.length()!=5) {
			System.out.println("need to be exactly 5 characters");
		}else if(word1.charAt(4)== word2.charAt(0)) {
			System.out.println("Fizz");
		}else{
			System.out.println("Buzz-did not match");
		}

	}

}
