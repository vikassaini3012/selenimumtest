package packagejavatraining;

public class Contstructor 
{

	int a, b,c,d;
	
	public Contstructor(int a) 
	{
		this.a = this.a;
		
		System.out.println(a);

	}

	public Contstructor(char a, int b) 
		{
	//	this (2,3);
	//	this.method1();
		
		System.out.println("Alpha block");	
	
		a = 'A';
		for (b='A'; a<='E';a++) 
		{
			System.out.print(a+ "-"); 
		}
		System.out.println(); 
		}	
	public Contstructor(int a,int d) 
		{
		this ('A',1);
		System.out.println("integer block");	
		}

	/*public void method1(int a)
	{
		a = this.a;
		System.out.println(a);

	}*/
	
	public void method2()
	{
		System.out.println("This is method2");
	}
	public static void main(String[] args) 
	
	{
		
		Contstructor cons = new Contstructor(12);
	//	cons.method1(12);
		

	}
}








