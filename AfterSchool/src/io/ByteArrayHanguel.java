package io;

import java.io.*;
//�ܼ� �Է� ���(����Ʈ����)
public class ByteArrayHanguel {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		byte[] b= new byte[1024];//byte�迭 1024�� 
		int length=0;//length �ڹ� �Է��ϸ�
		length= System.in.read(b);//�ֿܼ� �Է��� ���� b�� �����ϰ�, length�� ��ȯ���� 4�� ��
		System.out.write(b,0,length);
		
	}

}
