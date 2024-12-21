package Array;

public class EnhancedForLoop {

	public static void main(String[] args) {
		
		//Enhanced for loop// for each loop
//		int a[]= {1,2,3,4,5};
//		for(int value:a)
//		{
//			System.out.print(value+" ");
//		}
		int b[][]= {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		for(int temp[]:b)
		{
			for(int value:temp)
			{
				System.out.print(value+" ");
			}
			System.out.println();
		}

	}

}
