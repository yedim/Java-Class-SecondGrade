package io;

import java.io.*;
//�ܼ� �Է� ���(����Ʈ���� �ѱ��Է�)
public class BufferedInputOutputStream {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		BufferedInputStream bis = new BufferedInputStream(System.in);//Ű���������� ������ �־�ߴ�
		BufferedOutputStream bos= new BufferedOutputStream(System.out);//��������� ������ �־�ߴ�
		
		int a;
		while((a=bis.read())!=-1)
		{
			bos.write(a);	//ctrl+z������ ���
		}
		bis.close();
		bos.close();
	}

}
