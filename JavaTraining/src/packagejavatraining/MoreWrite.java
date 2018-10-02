package packagejavatraining;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MoreWrite 
{

	
	
public static void main(String[] args) throws IOException 
	{
		File f1 = new File("C:\\JavaTraining\\DummyFiles\\Dummy1.txt");
		FileWriter fw1 = new FileWriter(f1,true);
		BufferedWriter bwr = new BufferedWriter(fw1);
		bwr.newLine();
		fw1.write("File writer line1");
		
		fw1.write("File writer line2");
		bwr.newLine();
		bwr.write("Bufferwriter Line 3, with 1 new line");
		bwr.newLine();
		bwr.newLine();
		bwr.write("Bufferwriter Line 4, with 2new line");
		//fw1.close();
		bwr.close();
		FileReader fr1 = new FileReader(f1);
			    BufferedReader b1 = new BufferedReader(fr1);
			    String s;
			    while ((s=b1.readLine())!= null)
			    {
			    	System.out.println(s);
			    }
	}
	
	
}
