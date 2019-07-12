package MentoringsZuhra;

public class StirngIndexOf {

	public static void main(String[] args) {
		
		// indexOff :returns the index of specified substring-->int a = name.indexOf(ch);
				//index.returns -1 if not found
				    //          01234567890
				String name1 = "Tugba Tuygu";
				
				int n1 = name1.indexOf("g");
				int n2 = name1.indexOf(" ");
				
				        //inex 01234567
				System.out.println(n1);
				System.out.println(n2);
				
				//returns the specified substring
			   //index starting with given index. --> indexOf(str,index num)
			  //-1 if not found
			 
				int n3 = name1.indexOf("T",6);
				System.out.println(n3);
				
				int n4 = name1.indexOf("u",10);
				System.out.println(n4);
				
				
				
				//returns the specified substring-->  lastIndexOf("");
				//index looking from end to beginning
				//order . -1 if not found
		       
				int n5 = name1.lastIndexOf("ba");
				System.out.println(n5);
		        
		       // String p1 = name.subString( beginningIndex, EndingIndex )
		       //   returns substring from given begin
		       // index till right before end index.
				String s1 = name1.substring(1,4);
			       System.out.println(s1);
	}

}
