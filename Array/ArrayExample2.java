package Array;

import java.util.Scanner;
//finding smalllest array

public class ArrayExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		System.out.println("Enter the array:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int min=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(min<a[i])
				min=a[0];
		}
		System.out.println("Smallest number in array:"+min);
	}

}
