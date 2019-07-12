package Assessment;

public class Ass_7Quiz {
	
	

//	public static void main(String[] args) {
//
//		print( );
//
//		}
//
//		 
//
//		public static void print( ) throws Exception{
//
//		int[ ]  arr = new int[5];
//
//		for(int each: arr) {
//
//		System.out.print(each+" : ");
//
//		}
//
//		}
	//}

//     public static void main(String[] args) {
//
//      print();
//
//    System.out.println("Test Completed");
//
//     }
//
// 
//
//     public static void print() throws RuntimeException{
//
//      throw new RuntimeException();
//
//}
//
// 
//
//}
	
	public static void main(String[ ] args) {

		int[ ] arr = { 1, 2, 3};

		try {

		System.out.println( arr[100] );

		} catch(RuntimeException  e) {

		System.out.println("Runtime Exception Found");

		} catch (ArrayIndexOutOfBoundsException e) {

		System.out.println("Array index out of bound Exception Found");

		} catch (IndexOutOfBoundsException e) {

		System.out.println("Index out of bound Exception Found");

		}

		}
}



