package packagejavatraining;

public class StudentBA 
{
	int rollno;
	int age;
	public void dis1(int a)
		{
			System.out.println("Hi, This is BA Student with Roll No : "+rollno);
		}
		
		public void dis2(int a)
		{
			System.out.println("My age is : "+ age);
		}
	
public static void main(String[] args) 
		{
		
		StudentBA Deepak = new StudentBA();
		StudentBA Rahul = new StudentBA();
	
		Deepak.age = 40;
		Deepak.rollno = 111140;
		Deepak.dis1(Deepak.age);
		Deepak.dis2(Deepak.rollno);
		
		Rahul.age = 35;
		Rahul.rollno = 1000035;
		Rahul.dis1(Rahul.age);
		Rahul.dis2(Rahul.rollno);	
		}
}

