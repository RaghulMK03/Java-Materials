package TwoDimensinoalArray;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc=new Scanner(System.in);
		//System.out.println("Enter an row:");
		//int row=sc.nextInt();
		//System.out.println("Enter an collum:");
		//int col=sc.nextInt();
		//int a[][]=new int[row][col];
		int a[][]= {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				System.out.print(a[i][j] +" ");
			}
			System.out.println();
		}
		

	}

}
