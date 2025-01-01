package TwoDimensinoalArray;

import java.util.Scanner;

public class example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an row:");
		int row=sc.nextInt();
		System.out.println("Enter an collum:");
		int col=sc.nextInt();
		int a[][]=new int[row][col];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				System.out.println("Enter for"+i+","+j+" ");
				a[i][j]=sc.nextInt();
			}
		}
		
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