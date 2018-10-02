package packagejavatraining;

import java.util.Scanner;

public class UserInput 
{

	//Function #1
	public void hello(int a)
	{
		System.out.println("Welcome to Program # " +a);
		System.out.println("Hello Word");
	}
	
	//Function #2
	public void evenodd(int a)
	{
		int number;
		System.out.println("Welcome to Program # " +a);
		System.out.print("Enter the number : ");	
		
		Scanner pnumber = new Scanner(System.in);
		number = pnumber.nextInt();
		
		if (number%2 == 0)
		{
			System.out.println("This number is Even Number");
		}
		else 
		{
			System.out.println("This inumber is Odd Number");
		}
	}
		
	//Function #3
		public void swap1(int a)
		{
			int num1, num2;
			Scanner number = new Scanner(System.in);
					
			System.out.println("Welcome to Program # " +a);
			System.out.print("Enter the number 1 : ");
			num1 = number.nextInt();
			System.out.print("Enter the number 2 : ");
			num2 = number.nextInt();
			
			System.out.println("---------You have entered -------------"); 
			System.out.println("Number1 as : " +num1+ " and Number 2 as " +num2); 
		//	System.out.println("Number2 as : " +num2); 
		
			num1 = num2+num1;
			num2 = num1-num2;
			num1 = num1-num2;
			
			System.out.println("---------After Swapping -------------"); 
			System.out.println("Number1 as : " +num1+ " and number2 as "+num2); 
			//System.out.println("Number2 as : " +num2); 
		}
		
		public void swap2(int a)
		{
			int num1, num2, num3;
			Scanner number = new Scanner(System.in);
					
			System.out.println("Welcome to Program # " +a);
			System.out.print("Enter the number 1 : ");
			num1 = number.nextInt();
			System.out.print("Enter the number 2 : ");
			num2 = number.nextInt();
			
			System.out.println("---------You have entered -------------"); 
			System.out.println("Number1 as : " +num1+ " and Number 2 as " +num2); 
		
			num3 = num1;
			num1 = num2;
			num2 = num3;
			
			System.out.println("---------After Swapping -------------"); 
			System.out.println("Number1 as : " +num1+ " and Number 2 as " +num2); 
		}
		
		public void table(int a)
		{
			int num1, num2;
			Scanner number = new Scanner(System.in);
					
			System.out.println("Welcome to Program # " +a);
			System.out.print("Enter the number to print Table : ");
			num1 = number.nextInt();

			for (num2=1;num2<=10;num2++)
			{
			//	num3=num1*num2;
				System.out.println(num1+ " X " +num2+ " = " +(num1*num2) );
			}
			
		}
			
		public void fibbonaci(int a)
			{
				int num1;
				int num2=1;
				int num3=0;
				int temp=0;
				Scanner number = new Scanner(System.in);
						
				System.out.println("Welcome to Program # " +a);
				System.out.print("Enter the number to fibbonaci : ");
				num1 = number.nextInt();

				do 
				{
					
					System.out.print(temp+ "-->");
					temp = num2+num3;
					num2 = num3;
					num3 = temp;
				}
				while (temp <= num1);
			}
			
		
		public void prime(int a)
		{
			int range, i, j, count;
			Scanner number = new Scanner(System.in);
					
			System.out.println("Welcome to Program # " +a);
			System.out.print("Enter the number to get prime # : ");
		
			range = number.nextInt();
			for (i=2;i<=range;i++)
				{
					 count=0;
					for (j=2;j<i;j++)
					{
						if(i%j==0)
						{
							count++;
						}
					}
				if(count == 0)
				{
					System.out.println(+i);
				}
				}
		}
	
	
		
		public void factorial(int a)
		{
			int facnum, i, count, temp;
			count =1;
			Scanner number = new Scanner(System.in);
					
			System.out.println("Welcome to Program # " +a);
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
	
		public void formatprint(int a)
		{
			int i,j,k,val;
			
					
			Scanner number = new Scanner(System.in);
					
			System.out.println("Welcome to Program # " +a);
			System.out.print("Enter the number of Rows # : ");
		
			val = number.nextInt();
			System.out.println("Format is as Follow:");
			
			for (i=1;i<=val;++i)
				{
				  for(j=i;j<val;j++) 
				  {
					System.out.print(" ");				
				   }
				 
				  for(k=1;k<(i*2);k++) 
				  {
					System.out.print("*");
				
					
				   } 
				  
					System.out.println();
				}
		}
		
		
		
//////////////////////////////////////////////////////////////////////		
		
		
public static void main(String[] args) 
	{
				
		int option;
		
		// all objects 
		
		UserInput basicfunctions = new UserInput();
	
/////////Menus/////////////
		System.out.println("------------Welcome to Basic functions---------");
		System.out.println("List of Available Program");
		System.out.println("Program # 1 : Print 'Hello Word'");
		System.out.println("Program # 2 : Even Odd'");
		System.out.println("Program # 3 : Swap 2 number Without third Number");
		System.out.println("Program # 4 : Swap 2 number with help of third Number");
		System.out.println("Program # 5 : Print Table of a number");
		System.out.println("Program # 6 : Print Fibbonaci series");
		System.out.println("Program # 7 : Print Print numbers");
		System.out.println("Program # 8 : Factorial");
		System.out.println("Program # 9 : Format Print");
		System.out.print("Select the Number to execute program :");
		
		
		Scanner pnumber = new Scanner(System.in);
		
		option = pnumber.nextInt();
		
		System.out.println("You Selection was =" +option);
	//	System.out.println("Welcome to Program # " +option);
		
		if (option == 1)
		{
			basicfunctions.hello(option);
		}
		else if (option ==2)
		{
			basicfunctions.evenodd(option);
		}
		else if (option ==3)
		{
			basicfunctions.swap1(option);
		}
		else if (option ==4)
		{
			basicfunctions.swap2(option);
		}
		else if (option ==5)
		{
			basicfunctions.table(option);
		}
		else if (option ==6)
		{
			basicfunctions.fibbonaci(option);
		}
		else if (option ==7)
		{
			basicfunctions.prime(option);
		}
		else if (option ==8)
		{
			basicfunctions.factorial(option);
		}
		else if (option ==9)
		{
			basicfunctions.formatprint(option);
		}
		else 
			System.out.println("!!!!!Sorry Wrong Number or Invalid Number Selected!!!!!!");
		/*	Scanner s  = new Scanner(System.in);
		System.out.println("Please Enter the Value : ");
		a = s.nextFloat();
				System.out.println("Please Enter the Value : "+a);*/
	}
}
