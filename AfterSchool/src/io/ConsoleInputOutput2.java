package io;

import java.io.*;
//�ܼ� �Է� ���(����Ʈ����)
public class ConsoleInputOutput2 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		int bt;
		///byte�δ� �����ϱ� byte�迭 ����
		while((bt=System.in.read())!=1)
		{
			System.out.print((char)bt);	//byte�����δ� �ѱ� �Է��� �ȵȴٿ�
		}
		
	}

}
