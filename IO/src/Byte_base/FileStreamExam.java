package Byte_base;

import java.io.*;
public class FileStreamExam {//copy��ɾ� ����.

	public static void main(String[] args) throws IOException {//JVM���� IOException�� �����ش�.  copy test.txt, test_!.txt ����� �Ű�����2����~ args[0]args[1]�� ���� ����.
		byte[]b=new byte[1024];
		FileInputStream fis =new FileInputStream("tin.txt");
		FileOutputStream fos = new FileOutputStream("tout.txt");
		
		fis.read(b);
		fos.write(b);
		fis.close();
		fos.close();
		
	}

}
