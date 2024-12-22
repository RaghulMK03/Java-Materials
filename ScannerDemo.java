package ClassObject;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("ENTER THE NAME:");
		String name=sc.next();
		
		System.out.println("ENTER THE AGE:");
		int age=sc.nextInt();
		
		System.out.println("ENTER THE TEMP:");
		double temp=sc.nextDouble();
		
		System.out.println("NAME ="+name);
		System.out.println("AGE ="+age);
		System.out.println("TEMP ="+temp);

	}

}
