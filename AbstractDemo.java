package Advance;
abstract class Employee
{
	abstract void display();
	void show()
	{
		System.out.println("i am a helpless man in a trap");
	}
}
class Staff extends Employee
{
	void display()
	{
		System.out.println("Abstract method in derived class");
	}
}

public class AbstractDemo {

	public static void main(String[] args) {
		
		/*
		Abstraction (abstract)
		-> Abstract method (method having only declaration)
		-> Definition will be written in Derived Class
		-> Abstract Class (contains atleast one abstract method)
		-> Concrete Class (class which doen't contain any abstract method)
		->We cannot Create for abstract class
		*/
		Staff obj=new Staff();
		obj.display();
		obj.show();

	}

}
