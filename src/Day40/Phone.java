package Day40;

public class Phone {
	
	 // these instance variales 
	  // can be accessed 
	  // inside instand methods directly 
	  // just like it's a local variable 
	  // for that method 
	  
	  // if you are outside class
	  // you need an object to access 
	  /// these attributes 
	 String brand;
	  String OS;
	  int capacity;

	  public void ring() {
	    System.out.println("ringing");
	  }

	  public void dial(long number) {
	    System.out.println("dialing " + number);
	    
	  }
	  public void displayBrand() {
		    
		    System.out.println("brand: "+  brand );
	  }

	public static void main(String[] args) {
		
		/*
	     * Create class Phone
	     * add few instance variable to define   attribute | properties| state of object 
	     * type as String , OS as String , capacity as int 
	     * 
	     * create 3 different phone object , iphone, sumsung , pixel 
	     * assign value for all attributes 
	     * 
	     * OPTIONALLY 
	     *   add a behavior to Phone object  
	     *   displayPhoneInfo method accept no param return no value 
	     *   --> this should print all phone attributes 
	     *   
	     * 
	     * */ 
		
		 Phone iphone  = new Phone();
		    iphone.brand = "Apple" ; 
		    iphone.OS = "IOS";
		    iphone.capacity = 64;
		    iphone.ring();
		    iphone.dial(425678936L);
		    
		    iphone.displayBrand();
		    
		    System.out.println( iphone.OS  );
		    
		    Phone samsung  = new Phone ();
		    samsung.brand = "Samsung" ; 
		    samsung.OS = "Android";
		    samsung.capacity= 124;
		    samsung.ring();
		    samsung.dial(425678936L);
		    
		    System.out.println( samsung.capacity  );
		    
		    
		    Phone pixel  = new Phone ();
		    pixel.brand = "Google" ; 
		    pixel.OS = "Google OS";
		    pixel.capacity = 32;
		    pixel.ring();
		    pixel.dial(425678936L);
		    
		    System.out.println( pixel.brand  );

	}

}
