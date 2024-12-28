package inner_class;
class outer
{
	int age = 21;
	public  void show(int num1,int num2) {
		int resulet = num1 + num2;
		System.out.println(resulet);
		
	}
	//"inner class" created inside "outer class"
	class inner
	{
		public void display()
		{
			System.out.println("inner class show .....!");
		}
	}
}

public class InnerClassDemo {

	public static void main(String[] args) {

		//object creation methods for nested inner class
		outer out = new outer();
		
		outer.inner in = out.new inner();
		in.display();
		out.show(10,20);

	}

}
