package Array;

import java.util.Scanner;

public class TwoDimensitionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an rows of m1:");
		int row1=sc.nextInt();
		System.out.println("Enter an colum of m1:");
		int col1=sc.nextInt();
		
		System.out.println("Enter an rows of m2:");
		int row2=sc.nextInt();
		System.out.println("Enter an colum of m2:");
		int col2=sc.nextInt();
		
		if(row1==row2 &col1==col2)
		{
			int a[][]=new int [row1][col1];
			int b[][]=new int [row2][col2];
			
			int c[][]=new int [row1][col1];
			
			//to get matrix 1 elements
			System.out.println("Enter matrix 1 element:");
			
			for(int i=0;i<a.length;i++)
			{
				for(int j=0;j<a[i].length;j++)
				{
					System.out.println("Enter for"+i+","+j+" ");
					a[i][j]=sc.nextInt();
				}
			}
			
			//to get matrix 2 elements
			System.out.println("Enter matrix 2 element:");
			
			for(int i=0;i<b.length;i++)
			{
				for(int j=0;j<b[i].length;j++)
				{
					System.out.println("Enter for"+i+","+j+" ");
					b[i][j]=sc.nextInt();
				}
			}
			
			
			//result show
			System.out.println("Resultant matrix:");
			for(int i=0;i<b.length;i++)
			{
				for(int j=0;j<b[i].length;j++)
				{
					//for addition we need to use "+"
					//for subtraction we use "-"
					c[i][j]=a[i][j]+b[i][j];
					System.out.print(c[i][j]+" ");

				}
				System.out.println();
			}		
		}
		else
		{
			System.out.println("Recheck the matrix order");
		}
	}

}
