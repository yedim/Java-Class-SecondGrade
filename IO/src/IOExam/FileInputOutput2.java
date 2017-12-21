package IOExam;

import java.io.*;
public class FileInputOutput2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startTime= System.currentTimeMillis();
		try {
			FileInputStream fis=new FileInputStream(args[0]);
			FileOutputStream fos=new FileOutputStream(args[1]);
			
			int readData=-1;
			
			while((readData=fis.read())!=-1)
			{
				fos.write(readData);
			}
			
			fis.close();
			fos.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch(IOException ie)
		{
			ie.printStackTrace();
		}
		

		long endTime = System.currentTimeMillis();
		System.out.println(endTime-startTime);	
	}

}
