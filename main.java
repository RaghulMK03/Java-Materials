package intro_example;
import java.util.Arrays;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("hello world");
		
		//Array declaration for integers & charters
		int numb1[]=new int[5];
		int numbers[]= {10,11,12,13,14};
		char alpha[]= {'a','b','c'};
		int len=alpha.length;
		// to get whole value
		System.out.println(Arrays.toString(numbers));
		System.out.println(Arrays.toString(alpha));
		
		//to get specific value
		System.out.println((numbers[1]));
		System.out.println((alpha[2]));
		System.out.println(len);
		
		//fixed value syntax
		final int ageOfPerson=18;
		//ageOfPerson=21;
		System.out.println(ageOfPerson);
		
		}

}
