package Day51;

public class Assessment {
	
	
	int questionCount;
	int score;
	String type;
	
	static int timeLimit=45;
	
	
	public static void printtimeLimit() {
		
		System.out.println("time Limit" + timeLimit);
		
	}

	@Override
	public String toString() {
		return "Assessment [questionCount=" + 
	            questionCount +
				", score=" + score + ", "
						+ "type=" + type + "]";
	}
	
	

}
