package basic;

public class iterativeLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String name="Dragon Lord";
		
		//sum of n natural numbers
//		int n=5;
//		int sum=0;
//		for(int i=1;i<=n;i++) {
//			sum += i;
////			System.out.println("Dragon Lord");
//			
//		}
//		System.out.println(sum);
		
		
		//sum of factorial number(5!= 5*4*3*2*1)
		
		int n=5;
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact*=i;
		}
		System.out.println(fact);
	}

}
