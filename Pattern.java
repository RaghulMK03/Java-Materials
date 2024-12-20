package intro_example;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an number:");
		int num=sc.nextInt();
		if(num%2==0)
		{
			System.out.println("it is an even number");
		}
		else
		{
			System.out.println("it an odd number");
		}
		System.out.println("principal:");
		int principal=sc.nextInt();
		System.out.println("rate:");
		double rate=sc.nextDouble();
		System.out.println("time:");
		int time=sc.nextInt();
		int si=(int)(principal*rate*time)/100;
		System.out.println(si);
		
		

	}

}
