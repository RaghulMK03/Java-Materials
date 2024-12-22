package ClassObject;

//blue print (or)Template it used for ever element which required 
class Student
{
	String name;
	int age;
	int id;
	
	void display()
	{
		System.out.println("NAME = "+name);
		System.out.println("AGE = "+age);
		System.out.println("ID = "+id);
	}
}

public class ClassDemo {

	public static void main(String[] args) {
		//object
		//className userdefinedObject=new(keyword) constructor();
		Student s1=new Student();//
		Student s2=new Student();
		s1.name="Raghul";
		s2.name="Kavitha";
		s1.age=22;
		s2.age=47;
		s1.id=0007;
		s2.id=0003;
		s1.display();
		s2.display();
		
		

	}

}
