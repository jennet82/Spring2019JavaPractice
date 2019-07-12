package Day50;

public class StudentUser extends SlackUser{
	
//	 String displayName;
//		int timezone;
//		String status;
//	
	int groupNumber;
	
	public StudentUser (String displayName, int timezone, 
				String status, int groupNumber) {
		//super();
		
		this.displayName=displayName;
		this.timezone= timezone;
		this.status=status;
		this.groupNumber=groupNumber;
		
		
		
	}

      public String toString() {
		return "StudentUser [groupNumber=" + groupNumber + 
				", displayName=" + displayName +
				", timezone=" + timezone
				+ ", status=" + status + "]";
	}

}
