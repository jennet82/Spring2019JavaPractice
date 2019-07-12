package Day14;

public class MoreStringMethods {

	public static void main(String[] args) {
		
		//subString (beginningIndex,  EndingIndex)
		//beginning index is always inclusive
		//ending index is always exclusive
		
		           //012345
		String name="Merzet";
		
		//rze
		System.out.println( name.substring(2, 5));
		
		//System.out.println(name.substring(5,1)); wrong
		
		//System.out.println( name.substring(1, 10));wrong no 10 letters Merzet
		
		System.out.println( name.substring(1, 6)); //answer erzet sebabi o dan baslap sanayar
		
		
		
		

	}

}
