package basic;

public class FunctionMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b=10;
		int c=20;
		add(b,c);
		
		System.out.println("Welcome to the word ");
		dragonLord();
		dragonLord2();

	}
	public static void dragonLord() {
		System.out.println("This is an death match !");
	}
	public static void dragonLord2() {
		int a[]=new int[5];
		for(int i=0;i<5;i++) {
			System.out.println(a[i]);
			
		}
		
	}
	public static void add(int b,int c) {
		System.out.println(b+c);
	}
	
}
