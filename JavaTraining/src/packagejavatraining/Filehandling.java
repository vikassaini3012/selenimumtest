package packagejavatraining;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;

public class Filehandling 
{

	
	public void linebyline (String p) throws IOException
		{
			String path1 = p;
			File f1 = new File(path1);
		    FileReader fr1 = new FileReader(f1);
		    BufferedReader b1 = new BufferedReader(fr1);
		    String s;
		    while ((s=b1.readLine())!= null)
		    {
		    	System.out.println(s);
		    }
		}
		  
	public void chrbychr(String p) throws IOException
	{
		String path2 = p;
		File f2 = new File(path2);
	    FileReader fr2 = new FileReader(f2);	 
	    
			  int a;	
			  while ((a=fr2.read())!=-1)	
			   {
				   System.out.println((char)a);
			   }
	}
    
	
	public void write(String p, String q) throws IOException
		{
			String path1 = p;
			String val = q;
			File f = new File (path1);
			FileWriter fw = new FileWriter(f);
			fw.write(val);
			fw.close();
			
		}
		
	
	public static void main(String[] args) throws IOException 
	{
		String path1, path2;
		System.out.println("Please Enter Complete Path and File name : ");
		Scanner userinput = new Scanner(System.in);
		path1= userinput.next();
	//C:\JavaTraining\DummyFiles\Dummy1.txt	
	
	    Filehandling p = new Filehandling();	  
		
	    System.out.println("First method");
	    p.linebyline(path1);
		System.out.println("second method");
		p.chrbychr(path1);
		
		System.out.println("Enter string for third method:");
		Scanner userinput1 = new Scanner(System.in);
		String write1= userinput1.next();
		 p.write(path1, write1);
		
		System.out.println("fourth method");
		 p.linebyline(path1);
	}







}	  		
			  


