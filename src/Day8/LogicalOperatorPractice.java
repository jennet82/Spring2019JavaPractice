package Day8;

public class LogicalOperatorPractice {

	public static void main(String[] args) {
	
		int score=10;
		boolean result1 = score > 4;//true
		boolean result2 = score > 4 && score < 11;//true
		boolean result3 = score > 14 && score < 11;//false
		boolean result4 = score > 14 || score < 11;//true
		
		                   //10           //11
		boolean result5 = score++ >10 && score < 12;//false 10>10 && 11<12
		boolean result6 = ++score >10 && score < 12;//false  11>10 && 11<12
		boolean result7 = score++ >10 || score < 12 ;// true  10>10 || 11<12
		boolean result8 = score++ >10 && ++score <13; // false 10>10 false so it wil not evaluate next one
		boolean result9 = score++ >10 &  ++score <13;
		boolean result10 = score  >10 &  score < 13;//false
		boolean result11 = score  >10 |  ++score < 13;//true
		
		boolean result12 = !true && true;
		boolean result13 = (score > 5)&&(6>5);// TRUE TRUE --> TRUE
		boolean result14 = (score >5)&& !(6>5);// TRUE FALSE --> FALSE
		boolean result15 = (score > 5) && (score > 11) && (score/2 ==5);// TRUE TRUE --> TRUE
		boolean result16 = (score >5)&& (score <= 11) && (score/2 ==5);// TRUE FALSE --> FALSE
		
		
		//TRUE && TRUE && FALSE---FALSE
		//FALSE || FALSE || TRUE ---TRUE
		System.out.println( true && false || true);//TRUE
		System.out.println( true || false && true);//TRUE
		
		      // PRECEDENCE 
		
		                   //FALSE  OR     (TRUE AND TRUE)
		//System.out.println( score > 10 || (score == 10 && score > 5) );
		
		
		
		System.out.println("result1 is:  "+ result1 );//true
		System.out.println("result2 is:  "+ result2 );//true
		System.out.println("result3 is:  "+ result3);//false
		System.out.println("result4 is:  "+ result4);//true
		System.out.println("result5 is:  "+ result5);//false
		System.out.println("result6 is:  "+ result6);//false
		System.out.println("result7 is:  "+ result7);//true
		System.out.println("result8 is:  "+ result8);//false
		System.out.println("result9 is:  "+ result9);//false
		System.out.println("result10 is:  "+ result10);//false
		System.out.println("result11 is:  "+ result11);//true
		System.out.println("result13:  "+ result13);//true
		System.out.println("result14:  "+ result14);//false
		System.out.println("result15:  "+ result15);
		System.out.println("result16:  "+ result16);
	}
	
		

}
