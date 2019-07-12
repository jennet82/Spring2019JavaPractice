package Day6;

public class WarmUp {

	public static void main(String[] args) {
		
		//declare a variable offerCount and give initial value of 1;
		int offerCount=1;
		System.out.println(offerCount);
		
		//let's imagine you get 5 offers today--> shorthand assignment to increment the value
		offerCount+=5;
		System.out.println(offerCount);
		
		//you have rejected 2 of them;
		offerCount-=2;
		System.out.println(offerCount);
		
		//then after a week your offers multiplied by 4;
		offerCount*=4;
		System.out.println(offerCount);
		
		//then you decided to cut offers by half of what you have;
		offerCount/=2;
		System.out.println(offerCount);
		
		//eventually you want to get remainder by 5;
		offerCount%=5;
		System.out.println(offerCount);
		
		
		
	}

}
