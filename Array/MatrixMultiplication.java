package Array;
//colume1==row2   if only matrix multiplication possible
public class MatrixMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {
				{2,3},
				{4,5}
		};
		int b[][]= {
				{1,2,3},
				{4,5,6}
		};
		//2x2 2x3
		int c[][]=new int[a.length][b[0].length];
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b[0].length;j++)
			{
				for(int k=0;k<a[0].length;k++)
				{
					c[i][j]=c[i][j] +(a[i][k]*b[k][j]);
					
				}
			}
		}
		System.out.println("resultant matrix:");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b[0].length;j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}

}
