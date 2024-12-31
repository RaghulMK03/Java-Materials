package pattern;

public class JavaPattern_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		  0 1 2 3 3
//		0 * * * * *
//		1 *       *
//		2 *       *
//		3 *       *
//		4 * * * * *
		
		int row=10;
		int col=10;
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				if(i==0 ||i==row-1 ||j==0 ||j==col-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
			
		}

	}

}
