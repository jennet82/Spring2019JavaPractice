package Day8;

public class ConditionalSttm3 {

	public static void main(String[] args) {
		
		boolean isTimeToEndClass = true;
		
		boolean isTopicFinished = true;//false
		
		
		
		//if the variable itself is boolean type  == true is optional
		//if(isTimeToEndClass){
		
		if (isTimeToEndClass == true && isTopicFinished == true) {
			
			System.out.println("OK lets end the class");
			
		}else {
			
			System.out.println("Hang on tight");
			
			if (isTopicFinished == false) {
				System.out.println("Can we finish it in a few extra mins");
			}else {
				System.out.println("OK WE CAN GO NOW");
				
				
			}
			
		}
		
		
	}

}
