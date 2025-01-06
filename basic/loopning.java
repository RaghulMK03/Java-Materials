package basic;

public class loopning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int n=5;
//		int sum=0;
//		int i=1;
//		
//		while(i<=n) {
//			sum+=i;
//			i++;
//			
//		}
//System.out.println("sum of n numbers "+sum);
		
		
		//jump statement
		for(int i=1;i<=5;i++)
		{
			if(i==3) {
				//break terminate at that point
//				break;
				//continue only terminate that particular elements and move on to next elements
				continue;
			}
			System.out.println(i);
			
		}
	}

}
