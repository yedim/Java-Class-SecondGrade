package IOExam;

import java.io.*;
public class ReadLineFileExam {

	public static void main(String[] args) {
	
		try{

			BufferedReader br = new BufferedReader( new FileReader("BufferInput.txt"));	
			String aa=null;//ют╥б
			while((aa=br.readLine())!=null){
				System.out.println(aa);
			}
			br.close();
			
		}catch(IOException e){
			e.toString();
		}
	}

}
