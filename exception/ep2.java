package exception;

public class ep2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int a = 5/1;
//			System.out.println("hi..!");
			try
			{
				int c[] = {2};
				c[10] = 25;
				System.out.println("inner hi..!");
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("inner Exception..."+e);
			}
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception-->"+e);
		}
		finally
		{
			System.out.println("Bye User..!");
		}

	}

}
