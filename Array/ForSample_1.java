package Array;

class Student
{
	String name;
	int age;
	int num;
	void display() 
	{
		System.out.println("name :"+name);
		System.out.println("age :"+age);
		System.out.println("number :"+num);
	}
}
public class ForSample_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student();
		Student s2=new Student();
		s1.name="raghul";
		s2.name="dhoni";
		s1.age=21;
		s2.age=40;
		s1.num=03;
		s2.num=07;
		
		
		
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		for(int i=1;i<=5;i++)//i=row
		{
			for(int j=1;j<=5;j++) //j=collume
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Student details:");
		s1.display();
		s2.display();

	}

}
