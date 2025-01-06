package basic;
import java.util.Scanner;

class Employee{
	String name;
	int num;
	int age;
	
	public void show(String name,int num,int age ) {
		System.out.println("Enter the name : "+name);
		System.out.println("Enter the num : "+num);
		System.out.println("Enter the age : "+age);
	}
	
}

public class iterative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter var1 : ");
		int var1 = sc.nextInt();
		
		System.out.println("Enter var2 : ");
		int var2 = sc.nextInt();
		int var = var1 +var2;
			
		System.out.println("Total sum :" +var);
		sc.close();
		
		Employee emp = new Employee();
		emp.show("raghul",19,21);

	}
}
