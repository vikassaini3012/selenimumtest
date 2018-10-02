package packagejavatraining;

public class ClassA 
	{
	
		int a, b;
		public void display1()
			{
				System.out.println("Hello display1: "+a);
			}
		public void display2()
		{
			System.out.println("Hello display2 :"+b);
		}
		
		public static void main(String[] args) 
			{
				int result=5;
				System.out.println("Hello Main");
				System.out.println("Value of main result : "+result);
				
				ClassA displaymain = new ClassA();
				displaymain.display1();
				
				displaymain.a = 10;
				displaymain.b= 50;
				System.out.println("back in main");	
				result = displaymain.a + displaymain.b;
				System.out.println("Value of a+b = "+result);
				displaymain.display2();
				displaymain.display1();
				
			}
	}
