package packagejavatraining;

public class Maths 
		{
		   int resultsum, resultmulti, resultsubtract, resultdivide;
			public int sum (int a, int b)
				{
					resultsum = a + b;
					System.out.println("sum result in method:"+resultsum);
					return resultsum;
				}
		public int subtract (int a)
			{
				resultsubtract = resultsum - a;
				System.out.println("subtract result in method:"+resultsubtract);
				return resultsubtract;
			}
		public int multi (int a)
			{
				resultmulti = resultsubtract * a;
				System.out.println("multi result in method:"+resultmulti);
				return resultmulti;
			}
		public int divide (int a)
			{
				resultdivide = resultmulti / a;
				System.out.println("divide result in method:"+resultdivide);
				return resultdivide;
			}
		public void formula ()
			{
				System.out.println("formula result:"+ resultdivide);
			}
public static void main(String[] args) 
	{
		Maths formula1 = new Maths();
		formula1.sum(10, 2);
		formula1.subtract(2);
		formula1.multi(2);
		formula1.divide(2);
		formula1.formula();
	}
}
