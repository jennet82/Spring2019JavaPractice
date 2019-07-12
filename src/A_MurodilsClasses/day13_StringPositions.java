package A_MurodilsClasses;

public class day13_StringPositions {

	public static void main(String[] args) {
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println(alphabet.indexOf("A"));
		int pPosition = alphabet.indexOf("P");
		System.out.println("P is at index "+ pPosition);
		
		//HIJ location in alphabet
		int hijLocation = alphabet.indexOf("HIJ");
		System.out.println("hijLocation "+ hijLocation);
		
		String sentence ="Today is Sunday and tomaorrrow is Monday";
		System.out.println(sentence.indexOf("Sunday"));
		
		System.out.println(sentence.indexOf("a"));//3
		
		System.out.println(sentence.lastIndexOf("a"));
		
		System.out.println(sentence.indexOf("y", 6));
		
		System.out.println(sentence.indexOf("tomorrow"));

		if(sentence.indexOf("and")>=0) {
			System.out.println("Word is there");
		}else {
			System.out.println("Word is not there");
		}
	}

}
