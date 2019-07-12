package Repls;

public class Repl165 {

	public static void main(String[] args) {
		
	
		mergeStrings("12345", "abcde");
		System.out.println(mergeStrings("12345", "abcde"));
		System.out.println(mergeStrings("java", "selenium"));
	}
		
	
			  public static String mergeStrings(String one, String two) {
			    
			    String str="";
			   
			    for(int i=0;i<one.length();i++){
			    	 for(int j=0;j<two.length();j++){
			    str+=one.substring(i,i+1).concat(two.substring(j,j+1));
			   
			    if(one.length()>two.length()) {
			    	
			    str+=one.substring(two.length())	;
			    	
			    }else {
			    	 str+=two.substring(one.length())	;
			    }
			    
			    return str;

	}

}
			  }
	}
