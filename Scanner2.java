package ClassObject;

import java.util.Scanner;

public class Scanner2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		
		System.out.println("enter the candidate name:");
		String name=sc.next();
		
		System.out.println("enter the intrest:");
		String intrest=sc.next();
		
		System.out.println("enter the character:");
		char letter=sc.next().charAt(0);
		
		System.out.println("name="+name);
		System.out.println("interst="+intrest);
		System.out.println("letter="+letter);
		
		sc.close();
 
	}

}
