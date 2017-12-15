package io;

import java.io.*;
//콘솔 입력 출력(바이트단위)
public class ConsoleInputOutput {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		int bt;
		bt= System.in.read();//한 바이트 읽는다. returntype은 int
		System.out.println((char)bt);
	}

}
