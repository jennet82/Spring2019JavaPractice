package Day8;

public class TypeConversion {
	
	// typeConversion --> converting from on data type to another data type

	public static void main(String[] args) {
		
		int medium = 10;
		
		//byte, short, int, long
		// shot , tall, medium, grande   // starbuc cup size
		
		//Example#1 
		
		//long grande  = 10;
		//long grande = medium ;
		//System.out.println( grande );
		
		//typr widening / upcasting
		
		//short tall = 5L ; can not put a lomg value inside any variable that has smaller range
		
		//short tall = (short) grande ; // type narrowing / downcasting
		 
		//EXAMPLE 2
		
		//double superGrande = 15.67d;
		//int mediumCup = (int) superGrande ;
		
		//System.out.println(mediumCup);
		
		//EXAMPLE 3
		
		byte tinyExpressoCup =2 ;
		// type widening / upcasting
		//this will happen implicitly / automatically
		int mediumCup = tinyExpressoCup ; 
		// int mediumCup = (int) tinyExpressoCup;
		

		
		
		
		
		
		
		
		
		
		

	}

}
