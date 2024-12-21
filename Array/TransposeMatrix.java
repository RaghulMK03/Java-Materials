package Array;
//a^t=a
public class TransposeMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {
				{1,2,},
				{4,5,},
				{3,6}
		};
		
		int b[][]=new int[a[0].length][a.length];
		System.out.println("Transpose matrix:");
		
		for(int i=0;i<a[0].length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				b[i][j]=a[j][i];
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}

	}

}
