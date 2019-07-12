package A_MurodilsClasses;

public class day13_StringContains {

	public static void main(String[] args) {
		String word = "water";
		System.out.println(word.contains("tr"));
		
		System.out.println(word.startsWith("w"));
		System.out.println(word.endsWith("r"));
		System.out.println(word.endsWith("er"));
		
		String str = "";//true
		//String str = "abcs";//false
		System.out.println(str.isEmpty());

	}

}
