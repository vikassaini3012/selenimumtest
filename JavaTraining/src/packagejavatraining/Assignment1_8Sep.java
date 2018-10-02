package packagejavatraining;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Assignment1_8Sep 
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

	
	public void linebyline2file (String p) throws IOException
	{
		String path1 = p;
		File f1 = new File(path1);
	    FileReader fr1 = new FileReader(f1);
	    BufferedReader b1 = new BufferedReader(fr1);
	    
	    File f2 = new File("//C:\\JavaTraining\\DummyFiles\\Dummy2.txt");
	    FileWriter fw2 = new FileWriter(f2,true);
	    BufferedWriter bw = new BufferedWriter(fw2);
	    
	    String s;
	    
	    while ((s=b1.readLine())!= null)
	    {
	    	//System.out.println(s);
	    	bw.newLine();
	    	bw.write(s);
	    }
	    bw.close();
	}	
	
	public static void main(String[] args) throws IOException 
	
	{

		Assignment1_8Sep func = new Assignment1_8Sep();
		
		String line1, line2, line3, line4, line5,line6;
		
		File f1 = new File("//C:\\JavaTraining\\DummyFiles\\Dummy1.txt");
		
		FileWriter fw1 = new FileWriter(f1,true);
		BufferedWriter bw1 = new BufferedWriter(fw1);
				
	/*	Scanner userinput = new Scanner(System.in);
		
		System.out.println("Please Enter Line1 : ");
		line1= userinput.nextLine();
	    System.out.println("Please Enter Line2 : ");
		line2= userinput.nextLine();

	
		bw1.write(line1);
		bw1.newLine();
		bw1.write(line2);
		bw1.newLine();
		bw1.close();
		System.out.println("thanks for entering values");
		
	*/	
		String p = "//C:\\JavaTraining\\DummyFiles\\Dummy1.txt";
		String p1 = "//C:\\JavaTraining\\DummyFiles\\Dummy2.txt";
		
		System.out.println("||||||||||||||||File1 - Content||||||||||||||||||||||||||||| ");
		func.linebyline(p);
		
		System.out.println("||||||||||||||||File2 - Content||||||||||||||||||||||||||||| ");
		func.linebyline(p1);
		
		func.linebyline2file(p);
		
		System.out.println("||||||||||||||||File2 + File1 - Content||||||||||||||||||||| ");
		func.linebyline(p1);
	}
	
	
	
	
	
	
	
	
	
}
