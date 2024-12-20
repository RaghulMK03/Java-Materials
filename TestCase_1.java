package intro_example;

import java.util.Scanner;

public class TestCase_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an value:");
		int value=sc.nextInt();
		for(int i=1;i<=value;i++)
		{
			for(int j=1;j<=value-i;j++)
			{
				System.out.print(value);
			}
			System.out.println();
		}
		sc.close();

	}

}
