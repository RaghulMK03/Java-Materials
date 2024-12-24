package Interfaces;
@FunctionalInterface //lambada Expression ->( which is like "arrow function" in javascript )

interface MyInterface{
	
	int add(int i,int j);
//	void display();
}

public class InterfaceDemo2 {

	public static void main(String[] args) {
		
//		Type of interface
//		1) Normal interface (>1)
//		2) Functional interface with lambda expression (1 methods)
//		3) MArker interface (serializable)(0 methods) 
//		MyInterface  obj =(i,j) -> System.out.println("in total ="+ i + ":" +j);
//		obj.show(10,20);
		
		MyInterface  obj = (i,j) -> i+j ;
		int res = obj.add(10,20);
		System.out.println(res);
	}
 
}
