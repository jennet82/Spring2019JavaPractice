package A_MurodilsClasses;

public class M_ConverterUtility_MethodWithReturn02 {
	public static void main(String [] args) {
		System.out.println(miles2Km(55.0));
	}

	//Write a method: mile2km, accept miles and return km value:
	//return type:double
	//params: 1 double
	
	public static double miles2Km(double miles) {
//		double kms= miles*1.60934;
//		return kms;
//		
		return miles*1.60934;
	}
	
	
	/* method name: fahrenheitToCelcius
	 * Action: accepts fahrenheit an returns Celcius value
	 * Return type: int
	 * Params: 1 int
	 */
	
	public static int fahrenheitToCelcius(int farh) {
		return(farh-32)*5/9;
	}
	
	

}
