package constructorDemoSample;

class Demo
{
	private int age=21;

	public int getAge() {
		return age;
	}

	public void setAge(int val) {
		System.out.println("age changed "+val);
		this.age = val;
		
	}
	
}
public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo obj=new Demo();
		obj.setAge(50);
		System.out.println(obj.getAge());

	}

}
