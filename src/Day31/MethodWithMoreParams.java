package Day31;

public class MethodWithMoreParams {

	public static void main(String[] args) {
		
		// create a static method called login 
		  /* 
		   * it return nothing
		   * It takes 3 parameters : 
		   *     user as String , password as String, 
		   *     rememberMe as boolean
		   * inside body 
		   *     You entered username : ----
		   *     You entered password : ----
		   *     print you checked remeberMe checkbox if it's true 
		   *     print you did not check remeberMe checkbox if it's false
		   * */
		
		login("spartan","s300",true) ; 
	    
	    login("horse","h300",false) ; 
	    
	  }
	  
	  public static void login(String username, String password
	              ,boolean rememberMe) {
	  
	    System.out.println("You entered username : " + username);
	    System.out.println("You entered password : " + password);
	    
	    if(rememberMe==true) {
	      System.out.println("you checked remeberMe checkbox");
	    }else {
	      System.out.println("you did not check remeberMe checkbox");
		
		
		
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter user name");
//		String user = scan.next();
//		System.out.println("Enter password");
//		String password = scan.next();
//		System.out.println("click check box");
//		 
//		login(user, password, true);
//		
//		
//	}
//	
//	public static void login(String user, String password, boolean remeberMe) {
//		
//		System.out.println("You entered user name: " + user);
//		System.out.println("You entered password name: " + password);
//		
//		if(remeberMe == true) {
//			System.out.println("You checked remember me box");
//			if(user.equals("Odiljon") && password.equals("123")) {
//				System.out.println("Welcome Spartan");
//				
//			}else {
//				System.out.println("you have entered wront credetials");
//			}
//			
//		}else {
//			System.out.println("You did not checked remember me box");
//		}
		

	}

	  }
}
