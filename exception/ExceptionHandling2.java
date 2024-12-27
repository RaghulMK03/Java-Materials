package exception;

public class ExceptionHandling2 {
	public void throwsDemo() throws NullPointerException
	{
		String str = null;
		System.out.println(str.length());
	}
	public void slave()
	{
		try
		{
			throwsDemo();
		}
		catch(NullPointerException e)
		{
			System.out.println("oops-->"+e);
		}
		finally
		{
			System.out.println("End of the object Statement");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionHandling2 obj = new ExceptionHandling2();
		obj.slave();
		
//		

	}

}
