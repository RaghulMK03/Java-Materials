package intro_example;

import java.util.Scanner;

public class Simple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your name:");
		String name=sc.next();
		
		System.out.println("Enter your fav Anime:");
		String anime=sc.next();
		
		System.out.println("Welcom to our group "+name);
		System.out.printf("It's an good choise ,and we also like the "+anime);

	}

}
