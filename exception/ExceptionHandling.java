package exception;

import java.util.Scanner;

//try,catch,throw,throws,finally

public class ExceptionHandling {

	public static void main(String[] args) {
		
		
//		Scanner sc = new Scanner(System.in);
//		String sc = sc.
		// TODO Auto-generated method stub
		try
		{
			int a = 5/1;
			System.out.println("user input:  ...!");
			try
			{
				int c[] = {2};
				c[10] = 20;
				System.out.println("inner Hi..!");
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Inner block exception..."+e);
			}
		
		}
		catch(Exception n)
		{
			System.out.println(" this an Exception-->"+n);
		}
		
		System.out.println("Welcome...!");
		System.out.println("Hi ....!");

	}
//	public class Name;
//	{
//		
//		
//	}

}
