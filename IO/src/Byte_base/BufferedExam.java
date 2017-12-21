package Byte_base;
import java.io.*;
public class BufferedExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedInputStream bi= new BufferedInputStream(System.in);
		BufferedOutputStream bo = new BufferedOutputStream(System.out);
		
		int aa;
		try{
			while((aa= bi.read())!=-1)
			{
				bo.write(aa);
			}
			bo.flush();
			bo.close();
			bo.close();
		}catch(IOException e){
			
		}
	}

}
