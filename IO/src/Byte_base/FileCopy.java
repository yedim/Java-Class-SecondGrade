package Byte_base;

import java.io.*;
public class FileCopy {//copy��ɾ� ����.

	public static void main(String[] args) throws IOException {//JVM���� IOException�� �����ش�.  copy test.txt, test_!.txt ����� �Ű�����2����~ args[0]args[1]�� ���� ����.
		byte[]b=new byte[1024];
		FileInputStream fis =new FileInputStream(args[0]);//tin�� tout���� �ٲٴ°� �ƴ� args[0]  ó����args[0]�� exception�߻�
		FileOutputStream fos = new FileOutputStream(args[1]);//args�� Run-Run configuration-argument���� args[]��ŭ ����.
		
		fis.read(b);
		fos.write(b);
		fis.close();
		fos.close();
		
	}

}