package Array;

public class PrimarySecondary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {
				{1,2,3},
				{4,5,6},
				{8,8,9}
		};
		
		int pd=0;
		int sd=0;
		
		System.out.println("resultant Matrix:");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(i==j)
					pd=pd+a[i][j];
				if((i+j)==a.length-1)
					sd= sd + a[i][j];
			}
			
		}
		System.out.println(pd);
		System.out.println(sd);

	}

}
