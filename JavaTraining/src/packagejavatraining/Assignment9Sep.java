package packagejavatraining;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Assignment9Sep 
{

	
		
	public static void main(String[] args) throws IOException 
		{
		
			int i;
			String line = "My name is Vikas Saini";
			String reverse = "";
			String word = "";
			String reverseword = "";
			
			char [] temp = line.toCharArray();
			
			
			int len = line.length();
			int count =0;
					
			System.out.println(len);
			
			System.out.println("String : "+line);
			
			for (i=0; i <= len-1; i++)	
			{
			
				if(line.charAt(i) == 's')
				{
					count++;
				}
		}
			
			for (i=len-1;i>= 0; i--)	
				{
				//System.out.print(line.charAt(i));
				reverse =reverse + temp[i];
						
			}
			System.out.println("Reverse String : "+reverse);
			
			System.out.println("Occurance of s =  "+count);
				

}
}
	
	
	
	
	
	

