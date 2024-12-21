package Array;

import java.util.Scanner;

//finding largest number in array byb getting input from user

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a[]= new int[5];
		System.out.println("Enter an array:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
				max=a[i];
		}
		System.out.println("Maximum number in array :"+max);

	}

}
