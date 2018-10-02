package packagejavatraining;

public class Inherit extends UserInput
{

	public void method01()
	{
		System.out.println("this is vikas method1");
	}
	
	
	public static void main(String[] args) 
	
	{
		int a = 4;
		
		Inherit vikas = new Inherit();
		vikas.method01();
		vikas.formatprint(a);
	}
	
}
