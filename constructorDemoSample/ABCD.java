package constructorDemoSample;

class Example
{
	int n1;
	int n2;
	int result;
	
	Example(int a,int b)
	{
		n1=a;
		n2=b;
	}
	Example()
	{
		System.out.println("IT some check for overloading");
	}
	void display()
	{
		result=n1+n2;
		System.out.println("Result ="+result);
	}
}

public class ABCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example obj = new Example();
		Example obj1 =new Example(20,30);
		obj1.display();

	}

}
