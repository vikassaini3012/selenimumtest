package packagejavatraining;

import java.util.Scanner;

public class FormatPrint 
{
	
	public void armstrong(int a)
	{
		int sum, temp, orig;
		System.out.println("Entered Number : "+a);
		sum = 0; orig = a;
		do 
			{
				temp = a%10;
				sum = sum + temp*temp*temp;
				a /= 10;
			}
		while (a > 0);	
		System.out.println("reversed# : "+sum);
		if(orig ==sum)
		{
			System.out.println("Entered number is armstrong");
		}
		else 
		{
			System.out.println("Entered number is not armstrong");
		}
	}



	public static void main(String[] args) 
	
	{
		int val;
		System.out.println("Enter the Value : ");
		Scanner input = new Scanner(System.in);
		val =  input.nextInt();
	//	System.out.println("Enter the Value : " +val);
		
		FormatPrint func = new FormatPrint();
		
		func.armstrong(val);
				
	}
}
