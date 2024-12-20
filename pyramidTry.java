package intro_example;

import java.util.Scanner;

public class pyramidTry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr an times:");
		int times=sc.nextInt();
		for(int i=1;i<=times;i++)
		{
			for(int j=1;j<=times-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}sc.close();

	}

}
