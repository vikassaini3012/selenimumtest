package packagejavatraining;

import java.util.Scanner;

public class quick 
{
	public void factorial()
	{
		int facnum, i, count, temp;
		count =1;
		Scanner number = new Scanner(System.in);
				
		System.out.print("Enter the number to get factorial # : ");
	
		facnum = number.nextInt();
		System.out.println("Factorial or Number:"+facnum);
		
		for (i=1;i<=facnum;i++)
			{
			 count = count*i;
			 System.out.print(count+ " x ");
			}
		//System.out.println(+count);
	}	
	public static void main(String[] args) 
	{
		int  v =5;
		quick dd = new quick();
		dd.factorial();
	}
}
