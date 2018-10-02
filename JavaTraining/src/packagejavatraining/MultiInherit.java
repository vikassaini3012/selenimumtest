package packagejavatraining;

public class MultiInherit extends Inherit

{

	public void method1()
	{
		System.out.println("this is Movik-Child method1");
	}
	
	
	public static void main(String[] args) 
	
	{
		int a = 4;
		
		MultiInherit movik = new MultiInherit();
		movik.method1();
		movik.method01();
		movik.formatprint(10);
	}
	
	
}
