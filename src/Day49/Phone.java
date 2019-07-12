package Day49;

public class Phone extends Device {
	//int serialNum;
	String brand;
	int screenSize;
	
	
	
	
	public Phone(String brand, int screenSize , int serialNum) {
		//super();
		super(serialNum);
		this.brand = brand;
		this.screenSize = screenSize;
		//this.serialNum = serialNum;
		
	}

	public Phone() {
		
		//super(100);
		System.out.println("Phone Constructor");

}

public static void main(String[] args) {
	
	//Phone p = new Phone();
	Phone p1= new Phone("iphone", 7 , 123);
	
	System.out.println(p1.brand);
	System.out.println(p1.screenSize);
	System.out.println(p1.serialNum);
	
}
}