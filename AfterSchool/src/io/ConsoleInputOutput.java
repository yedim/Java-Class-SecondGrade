package io;

import java.io.*;
//�ܼ� �Է� ���(����Ʈ����)
public class ConsoleInputOutput {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		int bt;
		bt= System.in.read();//�� ����Ʈ �д´�. returntype�� int
		System.out.println((char)bt);
	}

}
