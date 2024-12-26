package sample;

public class Conditional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Nested if
		int mark;
		mark =75;
		if(mark>=40)
		{
			if(mark>=70)
			{
				System.out.println("Acceptable to join");
			}
			else
			{
				System.out.println("Not Accepted");
			}
		}
		else
		{
			System.out.println("Better luck next time");
		}
		System.out.println("Good Bye");

	}

}
