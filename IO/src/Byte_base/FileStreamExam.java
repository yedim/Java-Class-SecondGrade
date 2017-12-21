package Byte_base;

import java.io.*;
public class FileStreamExam {//copy명령어 같다.

	public static void main(String[] args) throws IOException {//JVM한테 IOException을 던져준다.  copy test.txt, test_!.txt 명령행 매개변수2개다~ args[0]args[1]에 각각 들어간다.
		byte[]b=new byte[1024];
		FileInputStream fis =new FileInputStream("tin.txt");
		FileOutputStream fos = new FileOutputStream("tout.txt");
		
		fis.read(b);
		fos.write(b);
		fis.close();
		fos.close();
		
	}

}
