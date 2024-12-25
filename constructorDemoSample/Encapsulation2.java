package constructorDemoSample;

class Demo1{
	private int Marks=70;

	public int getMarks() {
		return Marks;
	}

	public void setMarks(int Score) {
		System.out.println("the altered Marks "+ Score);
		this.Marks = Score;
	}
	
}
class demo2{
	private String sub="Maths";

	public String getSub() {
		return sub;
	}

	public void setSub(String subject) {
		this.sub = subject;
	}
	
	
}

public class Encapsulation2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo1 obj=new Demo1();
		obj.setMarks(90);
		System.out.println(obj.getMarks());
		demo2 obj1=new demo2();
//		obj1.setSub="science";
		System.out.println("the subject is "+obj1);

	}

}
