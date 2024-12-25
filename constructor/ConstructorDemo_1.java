package constructor;

class ABCD
{
	int n1;
	int n2;
	int result;
	
	//defult constructor which does't have an parameter
	ABCD()
	{
		n1=100;
		n2=200;
	}
	
	void display()
	{
		result=n1+n2;
		System.out.println("Result ="+result);
	}
}

public class ConstructorDemo_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ABCD obj=new ABCD();
		obj.display();

	}

}
