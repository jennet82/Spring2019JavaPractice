package Day8;

public class LogicalOperator2 {

	public static void main(String[] args) {
		
		boolean isHungry = true ;
		boolean isBreakTime = false;
		
		System.out.println("are you hungry and is it breaktime:  "+ (isHungry && isBreakTime) );
		System.out.println("are you hungry or is it breaktime:  "+ (isHungry || isBreakTime));
		
		boolean reverseIsHungry = ! isHungry;
		
		System.out.println(" Original isHungry:  "+ isHungry);
		System.out.println( " After reversing isHungry:  "+ reverseIsHungry);
		
		
		boolean isHungry1 = true ;
		boolean isBreakTime1 = false;
		boolean isYourLunchReady = true;
		boolean areWeSuperReady= isHungry1 && isBreakTime1 &&isYourLunchReady;
		
		System.out.println("hungry1, breaktime1,meal is ready1:   "+ areWeSuperReady);
		
		boolean isHungry2 = true ;
		boolean isBreakTime2 = false;
		boolean isYourLunchReady2 = true;
		boolean areWeSuperReady2 = isHungry2 || isBreakTime2 || isYourLunchReady2;
		
		System.out.println("hungry2 , breaktime2, meal is ready2:  "+ areWeSuperReady2);
		
		boolean isHungry3 = true ;
		boolean isBreakTime3= false;
		boolean isYourLunchReady3 = true;
		boolean areWeSuperReady3 = isHungry3&& isBreakTime3 || isYourLunchReady3;
		
		System.out.println("hungry3,breaktime3,meal is ready3:  " + areWeSuperReady3);
		
		
		 //Logical AND operator &&
		 //Logical OR operator  ||
		 //Logical NOT operator !
		
	}

}
