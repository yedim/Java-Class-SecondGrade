package ExceptionExam;
//FileNotFoundException과 IOException

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileExam {

	public static void main(String[] args)  {/*throws Exception*///command달면 예외처리안한거고 입력한거면 예외처리한거고 
		//throws는 자기를 호출한 곳에 예외처리를 넘김.main에서 호출했으면 JVM에게 넘겨준다. 이게바로 JVM이 처리한 결과다아아.
		// TODO Auto-generated method stub
		
		try {
			FileReader fr = new FileReader("datar.txt");
			FileWriter fw = new FileWriter("dataw.txt");

			int c;
			while((c=fr.read())!=-1)
			{
				fw.write(c);
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
	}

}
