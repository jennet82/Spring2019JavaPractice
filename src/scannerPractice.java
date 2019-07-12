import java.util.Scanner;

public class scannerPractice {

	public static void main(String[] args) {
		
		
		double cucumber = 2.5 ;
        int tomatos = 3 ;
        float onion = 1.5f ;
        byte pepper = 2 ;
        int carrot = 4 ;
        char a$ = '$' ;
    
                
        
        System.out.println("1 pcs cucumber price is --> " + cucumber + "$");
        System.out.println("4 pcs tomatos price is --> " + tomatos *4 + a$);
        System.out.println("2 pcs onion price is --> " + onion *2 + a$);
        System.out.println("1 pcs pepper price is --> " + pepper + a$);
        System.out.println("6 pcs carrot price is --> " + carrot*6 + a$);
        
        System.out.println("Total price for veggies --> " + 
        (cucumber + tomatos*4 + onion*2 + pepper + carrot*6));
		
		
		
		

	}

}
