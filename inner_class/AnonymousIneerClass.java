package inner_class;
class Test{
	
	public  void test() {
		System.out.println("in test");
	}
}
public class AnonymousIneerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test in = new Test() {
			public  void test() {
				System.out.println("in  inner test");
			}
			
		};
		in.test();

	}

}
