package Interfaces;

interface A
{
	//static & final variables
	//abstract methods
	int age = 21;
	 void show() ;//public abstract
	 void display();
	
}
class Aint implements A{
	
	
	@Override
	public void show() {
		System.out.println("A  interface");
	}
		
		
	
	@Override
	public void display() {
		System.out.println("B   interface");
		
		
	}
	
}

public class InterfaceDemo {

	public static void main(String[] args) {
		//class extends class
		//class implements  interface
		//interface extends interface
		A obj = new Aint();
		obj.show();
		obj.display();
		System.out.println(A.age);

	}

}
