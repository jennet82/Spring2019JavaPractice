package MentoringEmrayPala;

public class Array {

	public static void main(String[] args) {
		
		/** Arrays contain a fixed number of variables of the same type
		 * they are referenced by name and index.Imagine we have a class and I have 4 students
		 *
		 * 
		 *            0         1       2      3
		 *index--->  --------+-------+-------+------+
		 *           |       |       |       |      |
		 *Grades-->  | 77    |   84  |80     |96    |
		 *           --------+-------+--------+------+
		 *           |Tom    |Ed     |Joe    |Bob   |
		 *Students ->|_______+_______+________+_____+
		 * 
		 */
			int [] grades=new int [4];
			//assign values
			grades[0]=77;
			grades[1]=84;
			grades[2]=80;
			grades[3]=96;
			String []students=  {"Tom","Ed","Joe","Bob"};
			double sum=0.0;
			System.out.println("#    Students    Grades  \n");
			System.out.println("-\t------\t-----\n");
			for(int i=0;i<grades.length;i++) {
				System.out.println(i+"\t"+students[i]+"\t"+grades[i]);
				sum+=grades[i];
			}
	         double average=sum/grades.length;
	         System.out.println("Class average: "+average);
		

	}

}
