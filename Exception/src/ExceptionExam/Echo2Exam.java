package ExceptionExam;

import java.io.IOException;
import java.io.InputStream;

public class Echo2Exam {

	public static void main(String[] args) {
		InputStream is= System.in;
		try{
			while(true){
				int i=is.read();
				if(i==-1)break;
				System.out.println((char)(i));
			}
		}
		catch(IOException e){
			e.printStackTrace();
		}
		
	}
}
