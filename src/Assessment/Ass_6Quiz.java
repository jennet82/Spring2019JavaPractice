package Assessment;

import java.util.ArrayList;
import java.util.List;

public class Ass_6Quiz {
	
//	class Student {
//
//	     String name;
//
//	     int marks;
//
//	     Student(String name, int marks) {
//
//	         this.name = name;
//
//	         this.marks = marks;
//
//	     }
//
//	}
//
//	 
//
//	public class Test {
//
//	     public static void main(String[] args) {
//
//	         Student student = new Student("James", 25);
//
//	         int marks = 25;
//
//	         review(student, marks);
//
//	         System.out.println(marks + "-" + student.marks);
//
//	     }
//
//	 
//
//	     private static void review( Student  stud ,  int  marks) {
//
//	         marks = marks + 10;
//
//	         stud.marks += marks;
//
//	     }
//
//	}
//
//}

	
//	public static void main(String[ ] args) {
//
//        List<Character> list = new ArrayList<>( );
//
//        list.add(0, 'V');
//
//        list.add('T');
//
//        list.add(1, 'E');
//
//        list.add(3, 'O');
//
//
//
//        if( list.contains('O') ) {
//
//            list.remove('O');
//
//        }
//
//
//
//        for( char ch : list ) {
//
//            System.out.print ( ch );
//
//        }
//
//	}
//}

//What's the result ?
//
//
//VTEO
//
//VTE
//
//VET
//
//VETO
//
//Exception is thrown at Run time
//
//Compile Error
	
	
	public static void main(String[] args) {

        String [ ]   fruits =  {"apple", "banana",  "mango",  "orange"};

        for(String  fruit :  fruits) {

            System.out.print( fruit + " " );

            if( fruit.equals("mango") ) {

                continue;

            }

            System.out.println("salad!");

            break;

        }  

} 
}
//
//What's the result?
//
//
//None of the above
//
//apple salad!
//
//apple banana mango salad!
//
//apple banana salad!
//
//apple banana orange salad!