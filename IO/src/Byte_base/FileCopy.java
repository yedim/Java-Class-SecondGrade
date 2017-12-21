package Byte_base;

import java.io.*;
public class FileCopy {//copy명령어 같다.

	public static void main(String[] args) throws IOException {//JVM한테 IOException을 던져준다.  copy test.txt, test_!.txt 명령행 매개변수2개다~ args[0]args[1]에 각각 들어간다.
		byte[]b=new byte[1024];
		FileInputStream fis =new FileInputStream(args[0]);//tin을 tout으로 바꾸는게 아닌 args[0]  처음에args[0]은 exception발생
		FileOutputStream fos = new FileOutputStream(args[1]);//args는 Run-Run configuration-argument에서 args[]만큼 쓴다.
		
		fis.read(b);
		fos.write(b);
		fis.close();
		fos.close();
		
	}

}